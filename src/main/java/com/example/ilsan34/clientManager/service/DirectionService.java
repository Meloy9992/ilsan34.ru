package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Direction;

import java.math.BigInteger;
import java.util.List;

public interface DirectionService {
    void addNewDirection(Direction direction);

    Direction getById(BigInteger id);

    void updateDirection(Direction direction);

    void deleteDirection(BigInteger id);

    List<Direction> getAll();

}
