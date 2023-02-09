package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.SportHall;

import java.util.List;

public interface SportHallDao {
    void addNewSportHall(SportHall sportHall);

    SportHall getById(Long id);

    void updateSportHall(SportHall sportHall);

    void deleteSportHall(Long id);

    List<SportHall> getAll();
}
