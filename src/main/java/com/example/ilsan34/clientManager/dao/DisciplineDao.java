package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.Discipline;

import java.util.List;

public interface DisciplineDao {
    void addNewDiscipline(Discipline discipline);

    Discipline getById(Long id);

    void updateDiscipline(Discipline discipline);

    void deleteDiscipline(Long id);

    List<Discipline> getAll();
}
