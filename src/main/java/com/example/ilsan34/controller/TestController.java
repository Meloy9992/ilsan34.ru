package com.example.ilsan34.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/news")
    public String main(){
        return "news";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String admin(){
        return "admin";
    }
}
