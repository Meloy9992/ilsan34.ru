package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.News;

import java.util.List;

public interface NewsDao {
    void addNewNews(News news);

    News getById(Long id);

    void updateNews(News news);

    void deleteNews(Long id);

    List<News> getAll();
}
