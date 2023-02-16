package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.RegistrationForLesson;

import java.math.BigInteger;
import java.util.List;

public interface RegistrationForLessonService {
    void addNewRegistrationForLesson(RegistrationForLesson registration);

    RegistrationForLesson getById(BigInteger id);

    void updateRegistrationForLesson(RegistrationForLesson registration);

    void deleteRegistrationForLesson(BigInteger id);

    List<RegistrationForLesson> getAll();
}
