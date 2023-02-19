package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigInteger;

@Controller
public class QuestionController {

    private QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/question")
    public String getQuestions(Model model){
        model.addAttribute("questions", questionService.getAll());
        return "question";
    }

    @GetMapping("/question/{id}")
    public String getNewsById(@PathVariable("id") BigInteger id, Model model) {
        model.addAttribute("question", questionService.getById(id));
        model.addAttribute("size", Integer.parseInt(String.valueOf((questionService.getAll().size()))));
        return "questionById";
    }
}
