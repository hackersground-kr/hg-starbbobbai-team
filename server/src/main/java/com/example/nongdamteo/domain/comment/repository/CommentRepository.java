package com.example.nongdamteo.domain.comment.repository;

import com.example.nongdamteo.domain.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

