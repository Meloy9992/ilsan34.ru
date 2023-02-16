package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.model.News;
import com.example.ilsan34.clientManager.repository.NewsRepository;
import com.example.ilsan34.clientManager.service.NewsService;
import com.example.ilsan34.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;

@Controller
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;
    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/allNews")
    public String getNews(Model model){
        model.addAttribute("news", newsService.getAll());
        return "news";
    }

    @GetMapping("/{id}")
    public String getNewsById(@PathVariable("id") BigInteger id, Model model){
        model.addAttribute("news", newsService.getById(id).get());
        News news = newsService.getById(id).get();
        System.out.println(news);
        return "newsById";
    }
}
