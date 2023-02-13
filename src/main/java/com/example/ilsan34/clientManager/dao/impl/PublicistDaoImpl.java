package com.example.ilsan34.clientManager.dao.impl;

import com.example.ilsan34.clientManager.dao.PublicistDao;
import com.example.ilsan34.clientManager.model.Publicist;
import org.hibernate.Session;
import javax.persistence.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;




@Repository
public class PublicistDaoImpl implements PublicistDao {

    @Override
    public void addNewPublicist(Publicist publicist) {

    }

    @Override
    public Publicist getById(Long id) {
return null;
    }

    @Override
    public Publicist getByUsername(String username) {
        return null;
    }

    @Override
    public void updatePublicist(Publicist publicist) {

    }

    @Override
    public void deletePublicist(Long id) {

    }

    @Override
    public List<Publicist> getAll() {
        return null;
    }
}
