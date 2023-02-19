package com.example.ilsan34.controller;

import com.example.ilsan34.clientManager.model.News;
import com.example.ilsan34.clientManager.model.Photo;
import com.example.ilsan34.clientManager.model.Publicist;
import com.example.ilsan34.clientManager.repository.NewsRepository;
import com.example.ilsan34.clientManager.service.NewsService;
import com.example.ilsan34.clientManager.service.PhotoService;
import com.example.ilsan34.clientManager.service.PublicistService;
import com.example.ilsan34.security.UserDetailsServiceImpl;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.*;
import java.math.BigInteger;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    private PhotoService photoService;

    private PublicistService publicistService;

    @Autowired
    public NewsController(NewsService newsService, PhotoService photoService, PublicistService publicistService) {
        this.newsService = newsService;
        this.photoService = photoService;
        this.publicistService = publicistService;
    }


    @GetMapping("/allNews")
    public String getNews(Model model) {
        List<News> newsList = newsService.getAll();
        model.addAttribute("news", newsList);
        return "news";
    }

    @GetMapping("/{id}")
    public String getNewsById(@PathVariable("id") BigInteger id, Model model) throws IOException {

       // List<Photo> photos = newsService.getById(id).get().getPhoto();
        Photo photo = photoService.getById(BigInteger.valueOf(4));
        System.out.println(photo);

        byte[] decodedBytes = Base64.getDecoder().decode(photo.getPhoto());

        //FileUtils.writeByteArrayToFile(new File("file.png"), decodedBytes);


        //model.addAttribute("image", base64Encoded);
        model.addAttribute("news", newsService.getById(id).get());
        model.addAttribute("size", Integer.parseInt(String.valueOf((newsService.getAll().size() - 1))));
        return "newsById";
    }
}
