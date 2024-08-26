package com.example.nongdamteo.domain.board.service;

import com.example.nongdamteo.domain.board.dto.BoardDto;
import com.example.nongdamteo.domain.board.entity.BoardEntity;
import com.example.nongdamteo.domain.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public BoardEntity create(BoardDto dto) {
        BoardEntity entity = dto.toEntity();
        if(entity.getId() == null){
            return null;
        }
        return boardRepository.save(entity);
    }

    public BoardEntity update(Long id, BoardDto dto) {
        BoardEntity entity = dto.toEntity();

        BoardEntity target = boardRepository.findById(id).orElse(null);
        if(target == null) {
            return null;
        }

        target.patch(entity);
        BoardEntity updated = boardRepository.save(target);
        return updated;
    }


    public List<BoardEntity> post() {
        return boardRepository.findAll();
    }

    public BoardEntity delete(Long id) {
        BoardEntity target = boardRepository.findById(id).orElse(null);

        if(target == null) {
            return null;
        }

        boardRepository.delete(target);
        return target;

    }
}
