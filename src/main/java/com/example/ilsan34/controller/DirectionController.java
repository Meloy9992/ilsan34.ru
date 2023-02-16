package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.model.Direction;
import com.example.ilsan34.clientManager.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigInteger;
import java.util.List;

@Controller
public class DirectionController {

    private DirectionService directionService;

    @Autowired
    public DirectionController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @GetMapping("/direction")
    public String getDirection(Model model){
        model.addAttribute("directions", directionService.getAll());
        return "directions";
    }

    @GetMapping("/direction/{id}")
    public String getDirection(@PathVariable("id") BigInteger id, Model model){
        model.addAttribute("directions", directionService.getById(id));
        model.addAttribute("size", Integer.parseInt(String.valueOf((directionService.getAll().size() - 1))));
        return "directionById";
    }

}
