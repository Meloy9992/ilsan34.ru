package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.SportHall;

import java.util.List;

public interface SportHallService {
    void addNewSportHall(SportHall sportHall);

    SportHall getById(Long id);

    void updateSportHall(SportHall sportHall);

    void deleteSportHall(Long id);

    List<SportHall> getAll();
}
