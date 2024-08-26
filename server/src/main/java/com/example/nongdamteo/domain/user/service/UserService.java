package com.example.nongdamteo.domain.user.service;

import com.example.nongdamteo.domain.user.controller.UserController;
import com.example.nongdamteo.domain.user.controller.UserController.TokenResponse;
import com.example.nongdamteo.domain.user.controller.UserController.SignUpRequest;
import com.example.nongdamteo.domain.user.controller.UserController.SignInRequest;
import com.example.nongdamteo.domain.user.entity.User;
import com.example.nongdamteo.domain.user.entity.RefreshToken;
import com.example.nongdamteo.domain.user.jwt.JwtUtil;
import com.example.nongdamteo.domain.user.repository.RefreshTokenRepository;
import com.example.nongdamteo.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;
    private final RefreshTokenRepository refreshTokenRepository;


    // 회원가입
    @Transactional
    public UserController.TokenResponse signUp(SignUpRequest request) {
        if (!request.password().equals(request.passwordConfirm())) {
            throw new IllegalArgumentException("비밀번호 확인이 일치하지 않습니다.");
        }

        User newUser = User.builder()
                .username(request.username())
                .password(new BCryptPasswordEncoder().encode(request.password()))
                .build();

        String accessToken = jwtUtil.createAccessToken(newUser);
        String refreshToken = jwtUtil.createRefreshToken(newUser);

        userRepository.save(newUser);
        refreshTokenRepository.save(
                RefreshToken.builder()
                        .user(newUser)
                        .token(refreshToken)
                        .build()
        );
        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }

    // 로그인
    //TODO: 예외처리 및 예외 메시지 분리
    @Transactional
    public TokenResponse signIn(SignInRequest request) {
        User user = userRepository.findByUsername(request.username())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));
        if (!new BCryptPasswordEncoder().matches(request.password(), user.getPassword())) {
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        RefreshToken refreshTokenEntity = refreshTokenRepository.findByUserId(user.getId())
                .orElseThrow(() -> new IllegalArgumentException("토큰이 존재하지 않습니다."));
        String accessToken = "";
        String refreshToken = refreshTokenEntity.getToken();
        if (jwtUtil.isValidRefreshToken(refreshToken)) {
            accessToken = jwtUtil.createAccessToken(user);
            return TokenResponse.builder()
                    .accessToken(accessToken)
                    .refreshToken(refreshToken)
                    .build();
        } else {
            refreshToken = jwtUtil.createRefreshToken(user);
            refreshTokenEntity.updateToken(refreshToken);
        }
        return TokenResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
