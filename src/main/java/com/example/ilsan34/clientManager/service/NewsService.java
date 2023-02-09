package com.example.ilsan34.clientManager.service;

import java.util.List;

public interface NewsService {
    void addNewNews(com.example.ilsan34.clientManager.model.News news);

    com.example.ilsan34.clientManager.model.News getById(Long id);

    void updateNews(com.example.ilsan34.clientManager.model.News news);

    void deleteNews(Long id);

    List<com.example.ilsan34.clientManager.model.News> getAll();
}
