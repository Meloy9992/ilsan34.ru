package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Photo;

import java.math.BigInteger;
import java.util.List;

public interface PhotoService {

    void addNewPhoto(Photo photo);

    Photo getById(BigInteger id);

    void updatePhoto(Photo photo);

    void deletePhoto(BigInteger id);

    List<Photo> getAll();
}
