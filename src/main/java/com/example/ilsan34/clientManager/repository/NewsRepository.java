package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface NewsRepository extends CrudRepository<News, BigInteger> {

    List<News> findAll();
    Optional<News> findById(BigInteger id);
}
