package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Question;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;


public interface QuestionService {

    Question getById(BigInteger id);

    List<Question> getAll();
}
