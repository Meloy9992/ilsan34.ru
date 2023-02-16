package com.example.ilsan34.clientManager.service.impl;

import com.example.ilsan34.clientManager.model.Direction;
import com.example.ilsan34.clientManager.repository.DirectionRepository;
import com.example.ilsan34.clientManager.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class DirectionServiceImpl implements DirectionService {

    private DirectionRepository directionRepository;

    @Autowired
    public DirectionServiceImpl(DirectionRepository directionRepository) {
        this.directionRepository = directionRepository;
    }

    @Override
    public void addNewDirection(Direction direction) {

    }

    @Override
    public Direction getById(BigInteger id) {
        Direction direction =directionRepository.findById(id).get();
        return direction;
    }

    @Override
    public void updateDirection(Direction direction) {

    }

    @Override
    public void deleteDirection(BigInteger id) {

    }

    @Override
    public List<Direction> getAll() {
        List<Direction> directions = directionRepository.findAll();
        return directions;
    }
}
