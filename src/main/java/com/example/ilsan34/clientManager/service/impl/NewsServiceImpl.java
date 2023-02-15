package com.example.ilsan34.clientManager.service.impl;

import com.example.ilsan34.clientManager.model.News;
import com.example.ilsan34.clientManager.repository.NewsRepository;
import com.example.ilsan34.clientManager.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public void addNewNews(News news) {
        newsRepository.save(news);
    }

    @Override
    public Optional<News> getById(BigInteger id) {
        return newsRepository.findById(id);
    }

    @Override
    public void updateNews(News news) {
    }

    @Override
    public void deleteNews(BigInteger id) {
        newsRepository.deleteById(id);
    }

    @Override
    public List<News> getAll() {
        System.out.println();
        return newsRepository.findAll();
    }
}
