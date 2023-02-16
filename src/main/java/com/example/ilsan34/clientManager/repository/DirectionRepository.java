package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.Direction;
import com.example.ilsan34.clientManager.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface DirectionRepository extends CrudRepository<Direction, BigInteger> {
    List<Direction> findAll();
    Optional<Direction> findById(BigInteger id);
}
