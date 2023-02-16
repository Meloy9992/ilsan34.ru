package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.RegistrationForLesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RegistrationForLessonRepository extends CrudRepository<RegistrationForLesson, BigInteger> {
}
