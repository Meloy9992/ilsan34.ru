package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private DirectionService directionService;

    @Autowired
    public MainController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("directions", directionService.getAll());
        return "main";
    }
}
