package com.example.ilsan34.clientManager.dao;

import com.example.ilsan34.clientManager.model.Publicist;

import java.util.List;

public interface PublicistDao {
    void addNewPublicist(Publicist publicist);

    Publicist getById(Long id);

    Publicist getByUsername(String username);

    void updatePublicist(Publicist publicist);

    void deletePublicist(Long id);

    List<Publicist> getAll();
}
