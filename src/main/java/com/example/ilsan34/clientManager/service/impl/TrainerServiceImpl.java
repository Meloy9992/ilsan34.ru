package com.example.ilsan34.clientManager.service.impl;

import com.example.ilsan34.clientManager.model.Trainer;
import com.example.ilsan34.clientManager.repository.TrainerRepository;
import com.example.ilsan34.clientManager.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public void addNewTrainer(Trainer trainer) {
    }

    @Override
    public Trainer getById(BigInteger id) {
        Trainer trainer = trainerRepository.findById(id).get();
        return trainer;
    }

    @Override
    public void updateTrainer(Trainer trainer) {

    }

    @Override
    public void deleteTrainer(BigInteger id) {

    }

    @Override
    public List<Trainer> getAll() {
        List<Trainer> trainers = (List<Trainer>) trainerRepository.findAll();
        return trainers;
    }
}
