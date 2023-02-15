package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.News;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface NewsService {
    void addNewNews(com.example.ilsan34.clientManager.model.News news);

    Optional<News> getById(BigInteger id);

    void updateNews(com.example.ilsan34.clientManager.model.News news);

    void deleteNews(BigInteger id);

    List<com.example.ilsan34.clientManager.model.News> getAll();
}
