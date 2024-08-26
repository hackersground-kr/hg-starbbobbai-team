package com.example.nongdamteo.domain.comment.controller;

import com.example.nongdamteo.domain.comment.entity.Comment;
import com.example.nongdamteo.domain.comment.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/posts")
    public Comment addComment(@PathVariable Long postId, @RequestBody String content) {
        return commentService.addComment(postId, content);
    }

    @PutMapping("/{commentId}")
    public Comment updateComment(@PathVariable Long postId, @PathVariable Long commentId, @RequestBody String content) {
        // 게시글 ID를 확인하거나 로깅에 사용할 수 있지만 여기서는 댓글 ID로만 처리합니다.
        return commentService.updateComment(commentId, content);
    }

    @DeleteMapping("/{commentId}")
    public void deleteComment(@PathVariable Long postId, @PathVariable Long commentId) {
        commentService.deleteComment(commentId);
    }
}

