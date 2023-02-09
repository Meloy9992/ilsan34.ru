package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Photo;

import java.util.List;

public interface PhotoService {

    void addNewPhoto(Photo photo);

    Photo getById(Long id);

    void updatePhoto(Photo photo);

    void deletePhoto(Long id);

    List<Photo> getAll();
}
