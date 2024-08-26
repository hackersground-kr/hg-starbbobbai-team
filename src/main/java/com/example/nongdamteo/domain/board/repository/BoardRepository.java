package com.example.nongdamteo.domain.board.repository;

import com.example.nongdamteo.domain.board.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BoardRepository extends CrudRepository<BoardEntity, Long> {

    @Override
    ArrayList<BoardEntity> findAll();
}
