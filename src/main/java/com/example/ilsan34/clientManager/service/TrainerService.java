package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Trainer;

import java.util.List;

public interface TrainerService {

    void addNewTrainer(Trainer trainer);

    Trainer getById(Long id);

    void updateTrainer(Trainer trainer);

    void deleteTrainer(Long id);

    List<Trainer> getAll();
}