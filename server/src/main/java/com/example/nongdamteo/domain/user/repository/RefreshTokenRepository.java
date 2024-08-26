package com.example.nongdamteo.domain.user.repository;

import com.example.nongdamteo.domain.user.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByUserId(Long userId);

}
