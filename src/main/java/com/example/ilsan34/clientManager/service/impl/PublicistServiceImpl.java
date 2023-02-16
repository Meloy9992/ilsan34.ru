package com.example.ilsan34.clientManager.service.impl;


import com.example.ilsan34.clientManager.model.Publicist;
import com.example.ilsan34.clientManager.repository.PublicistRepository;
import com.example.ilsan34.clientManager.service.PublicistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class PublicistServiceImpl implements PublicistService {

    private PublicistRepository publicistRepository;

    @Autowired
    public PublicistServiceImpl(PublicistRepository publicistRepository) {
        this.publicistRepository = publicistRepository;
    }

    @Override
    public void addNewPublicist(Publicist publicist) {

    }

    @Override
    public Publicist getById(BigInteger id) {
        Publicist publicist = publicistRepository.findById(id).get();
        return publicist;
    }

    @Override
    public void updatePublicist(Publicist publicist) {

    }

    @Override
    public void deletePublicist(BigInteger id) {

    }

    @Override
    public List<Publicist> getAll() {
        return null;
    }
}
