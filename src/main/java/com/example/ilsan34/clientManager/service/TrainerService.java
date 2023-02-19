package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Trainer;

import java.math.BigInteger;
import java.util.List;

public interface TrainerService {

    void addNewTrainer(Trainer trainer);

    Trainer getById(BigInteger id);

    void updateTrainer(Trainer trainer);

    void deleteTrainer(BigInteger id);

    List<Trainer> getAll();
}
