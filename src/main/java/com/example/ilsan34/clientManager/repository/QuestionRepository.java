package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.Question;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface QuestionRepository extends CrudRepository<Question, BigInteger> {
}
