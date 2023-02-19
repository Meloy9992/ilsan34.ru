package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainersController {

    private TrainerService trainerService;

    @Autowired
    public TrainersController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainers")
    public String getAllTrainers(Model model){
        model.addAttribute("trainers", trainerService.getAll());
        return "trainers";
    }
}
