package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Direction;

import java.util.List;

public interface DirectionService {
    void addNewDirection(Direction direction);

    Direction getById(Long id);

    void updateDirection(Direction direction);

    void deleteDirection(Long id);

    List<Direction> getAll();

}
