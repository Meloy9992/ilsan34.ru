package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, BigInteger> {
}
