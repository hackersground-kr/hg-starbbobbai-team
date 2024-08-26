package com.example.nongdamteo.domain.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Getter
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String token;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Builder
    public RefreshToken(String token, User user){
        this.token = token;
        this.user = user;
    }

    public void updateToken(String token) {
        this.token = token;
    }
}
