package com.example.nongdamteo.domain.board.controller;


import com.example.nongdamteo.domain.board.dto.BoardDto;
import com.example.nongdamteo.domain.board.entity.BoardEntity;
import com.example.nongdamteo.domain.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // post
    @GetMapping("/post")
    public List<BoardEntity> post(){
        return boardService.post();
    }

    // get
    @PostMapping("/get")
    public ResponseEntity<BoardEntity> create(@RequestBody BoardDto dto){
        BoardEntity created = boardService.create(dto);
        return (created != null) ?
                ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // patch
    @PatchMapping("/patch/{id}")
    public ResponseEntity<BoardEntity> update(@PathVariable Long id,
                                              @RequestBody BoardDto dto){
        BoardEntity updated = boardService.update(id, dto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<BoardEntity> delete(@PathVariable Long id) {
        BoardEntity deleted = boardService.delete(id);
        return (deleted != null) ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
