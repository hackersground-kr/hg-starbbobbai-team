package com.example.nongdamteo.domain.comment.service;

import com.example.nongdamteo.domain.comment.entity.Comment;
import com.example.nongdamteo.domain.comment.entity.Post;
import com.example.nongdamteo.domain.comment.repository.CommentRepository;
import com.example.nongdamteo.domain.comment.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Transactional
    public Comment addComment(Long postId, String content) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));

        Comment comment = new Comment();
        comment.setContent(content);
        comment.setPost(post);

        return commentRepository.save(comment);
    }

    @Transactional
    public Comment updateComment(Long commentId, String newContent) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));

        comment.setContent(newContent);
        return commentRepository.save(comment);
    }

    @Transactional
    public void deleteComment(Long commentId) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(() -> new IllegalArgumentException("Comment not found"));

        commentRepository.delete(comment);
    }
}


