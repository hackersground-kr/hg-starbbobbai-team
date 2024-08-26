package com.example.nongdamteo.domain.user.controller;

import com.example.nongdamteo.domain.user.service.UserService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequiredArgsConstructor
@ResponseStatus
public class UserController {

    private final UserService userService;

    @PostMapping("/signUp") // 회원 가입
    public ResponseEntity<TokenResponse> signUp(@RequestBody SignUpRequest request) {
        if (userService.findByUsername(request.username()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.signUp(request));
    }

    @PostMapping("/signIn") // 로그인
    public ResponseEntity<TokenResponse> signIn(@RequestBody SignInRequest request) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.signIn(request));
    }

    @Builder
    public record TokenResponse(
            String accessToken,
            String refreshToken
    ) {

    }

    public record SignUpRequest(
            String username,
            String password,
            String passwordConfirm
    ) {

    }

    public record SignInRequest(
            String username,
            String password
    ) {

    }
}
