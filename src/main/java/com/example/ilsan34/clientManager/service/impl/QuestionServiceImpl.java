package com.example.ilsan34.clientManager.service.impl;

import com.example.ilsan34.clientManager.model.Question;
import com.example.ilsan34.clientManager.repository.QuestionRepository;
import com.example.ilsan34.clientManager.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    @Autowired
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question getById(BigInteger id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public List<Question> getAll() {
        return (List<Question>) questionRepository.findAll();
    }
}
