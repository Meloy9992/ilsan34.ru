package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.Photo;

import java.util.List;

public interface PhotoDao {

    void addNewPhoto(Photo photo);

    Photo getById(Long id);

    void updatePhoto(Photo photo);

    void deletePhoto(Long id);

    List<Photo> getAll();
}
