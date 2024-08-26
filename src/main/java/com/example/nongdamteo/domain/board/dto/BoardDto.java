package com.example.nongdamteo.domain.board.dto;


import com.example.nongdamteo.domain.board.entity.BoardEntity;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;


    public BoardEntity toEntity() {
        return new BoardEntity(id, title, content);
    }
}
