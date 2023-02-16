package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.model.News;
import com.example.ilsan34.clientManager.model.Publicist;
import com.example.ilsan34.clientManager.repository.NewsRepository;
import com.example.ilsan34.clientManager.service.NewsService;
import com.example.ilsan34.clientManager.service.PublicistService;
import com.example.ilsan34.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    private PublicistService publicistService;
    @Autowired
    public NewsController(NewsService newsService, PublicistService publicistService) {
        this.newsService = newsService;
        this.publicistService = publicistService;
    }


    @GetMapping("/allNews")
    public String getNews(Model model){
        List<News> newsList = newsService.getAll();
        model.addAttribute("news", newsList);
        return "news";
    }

    @GetMapping("/{id}")
    public String getNewsById(@PathVariable("id") BigInteger id, Model model){
        model.addAttribute("news", newsService.getById(id).get());
        return "newsById";
    }
}
