package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.model.RegistrationForLesson;
import com.example.ilsan34.clientManager.service.DirectionService;
import com.example.ilsan34.clientManager.service.RegistrationForLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MainController {

    private DirectionService directionService;

    private RegistrationForLessonService registrationForLessonService;

    @Autowired
    public MainController(DirectionService directionService, RegistrationForLessonService registrationForLessonService) {
        this.directionService = directionService;
        this.registrationForLessonService = registrationForLessonService;
    }

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("directions", directionService.getAll());
        return "main";
    }

    @PostMapping("/")
    public String mainForm(
                           @RequestParam(name = "firstName") String firstName,
                           @RequestParam(name = "lastName") String  lastName,
                           @RequestParam(name = "email") Optional<String> email,
                           @RequestParam(name = "phoneNumber") Long numberPhone,
                           @RequestParam(name = "comment") Optional<String> comment){
        RegistrationForLesson registration = new RegistrationForLesson(firstName,
                lastName,
                numberPhone,
                email,
                comment);
        registrationForLessonService.addNewRegistrationForLesson(registration);
        return "main";
    }
}
