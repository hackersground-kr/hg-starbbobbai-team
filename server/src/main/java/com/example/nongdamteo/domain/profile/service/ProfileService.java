package com.example.nongdamteo.domain.profile.service;

import com.example.nongdamteo.domain.profile.entity.Profile;
import com.example.nongdamteo.domain.profile.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ProfileService {

    private static final String UPLOAD_DIR = "uploads/";

    @Autowired
    private ProfileRepository profileRepository;

    public void updateProfileImage(Long userId, MultipartFile file) throws IOException {
        Profile profile = profileRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Invalid user ID"));

        if (file != null && !file.isEmpty()) {
            String fileName = profile.getUsername() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(UPLOAD_DIR + fileName);
            Files.write(filePath, file.getBytes());

            profile.setProfileImagePath(filePath.toString());
            profileRepository.save(profile);
        }
    }
}

