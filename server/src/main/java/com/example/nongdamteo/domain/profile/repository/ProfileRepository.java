package com.example.nongdamteo.domain.profile.repository;

import com.example.nongdamteo.domain.profile.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByUsername(String username);
}
