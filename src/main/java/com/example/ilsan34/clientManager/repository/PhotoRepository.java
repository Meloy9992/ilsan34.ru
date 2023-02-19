package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, BigInteger> {

    Photo getById(BigInteger id);
}
