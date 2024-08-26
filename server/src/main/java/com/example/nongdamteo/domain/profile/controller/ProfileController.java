package com.example.nongdamteo.domain.profile.controller;

import com.example.nongdamteo.domain.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{username}/edit")
    public String editProfile(@PathVariable String username, Model model) {
        // 유저 정보 가져오기 (생략)
        model.addAttribute("username", username);
        return "editProfile";
    }

    @PostMapping("/{userId}/updateImage")
    public String updateProfileImage(@PathVariable Long userId, @RequestParam("profileImage") MultipartFile file) {
        try {
            profileService.updateProfileImage(userId, file);
        } catch (IOException e) {
            // 예외 처리 (생략)
        }
        return "redirect:/profile/" + userId + "/edit";
    }
}
