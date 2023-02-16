package com.example.ilsan34.clientManager.service.impl;

import com.example.ilsan34.clientManager.model.RegistrationForLesson;
import com.example.ilsan34.clientManager.repository.RegistrationForLessonRepository;
import com.example.ilsan34.clientManager.service.RegistrationForLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class RegistrationForLessonServiceImpl implements RegistrationForLessonService {

    private RegistrationForLessonRepository registrationForLessonRepository;

    @Autowired
    public RegistrationForLessonServiceImpl(RegistrationForLessonRepository registrationForLessonRepository) {
        this.registrationForLessonRepository = registrationForLessonRepository;
    }

    @Override
    public void addNewRegistrationForLesson(RegistrationForLesson registration) {
        registrationForLessonRepository.save(registration);
    }

    @Override
    public RegistrationForLesson getById(BigInteger id) {
        return null;
    }

    @Override
    public void updateRegistrationForLesson(RegistrationForLesson registration) {

    }

    @Override
    public void deleteRegistrationForLesson(BigInteger id) {

    }

    @Override
    public List<RegistrationForLesson> getAll() {
        return null;
    }
}
