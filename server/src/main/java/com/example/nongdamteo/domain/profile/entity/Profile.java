package com.example.nongdamteo.domain.profile.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    private String profileImagePath;

    // Getters and Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }
}
