package com.example.nongdamteo.domain.comment.repository;

import com.example.nongdamteo.domain.comment.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

