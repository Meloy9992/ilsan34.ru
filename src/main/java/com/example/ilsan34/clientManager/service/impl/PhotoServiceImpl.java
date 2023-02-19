package com.example.ilsan34.clientManager.service.impl;


import com.example.ilsan34.clientManager.model.Photo;
import com.example.ilsan34.clientManager.repository.PhotoRepository;
import com.example.ilsan34.clientManager.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class PhotoServiceImpl implements PhotoService {

    private PhotoRepository photoRepository;

    @Autowired
    public PhotoServiceImpl(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public void addNewPhoto(Photo photo) {

    }

    @Override
    public Photo getById(BigInteger id) {
        Photo photo = photoRepository.getById(id);
        System.out.println(photo.getPhoto());
        return photo;
    }

    @Override
    public void updatePhoto(Photo photo) {

    }

    @Override
    public void deletePhoto(BigInteger id) {

    }

    @Override
    public List<Photo> getAll() {
        List<Photo> photos = (List<Photo>) photoRepository.findAll();

        return photos;
    }
}
