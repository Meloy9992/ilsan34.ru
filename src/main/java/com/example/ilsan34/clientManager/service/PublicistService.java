package com.example.ilsan34.clientManager.service;

import com.example.ilsan34.clientManager.model.Publicist;

import java.math.BigInteger;
import java.util.List;

public interface PublicistService {
    void addNewPublicist(Publicist publicist);

    Publicist getById(BigInteger id);

    void updatePublicist(Publicist publicist);

    void deletePublicist(BigInteger id);

    List<Publicist> getAll();
}
