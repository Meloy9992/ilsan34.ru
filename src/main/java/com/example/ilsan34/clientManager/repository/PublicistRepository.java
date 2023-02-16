package com.example.ilsan34.clientManager.repository;

import com.example.ilsan34.clientManager.model.Publicist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface PublicistRepository extends JpaRepository<Publicist, String> {
    Optional<Publicist> findByUserName(String username);
    Optional<Publicist> findById(BigInteger id);
}
