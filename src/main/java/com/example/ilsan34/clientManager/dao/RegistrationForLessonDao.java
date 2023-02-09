package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.RegistrationForLesson;

import java.util.List;

public interface RegistrationForLessonDao {
    void addNewRegistrationForLesson(RegistrationForLesson registration);

    RegistrationForLesson getById(Long id);

    void updateRegistrationForLesson(RegistrationForLesson registration);

    void deleteRegistrationForLesson(Long id);

    List<RegistrationForLesson> getAll();
}
