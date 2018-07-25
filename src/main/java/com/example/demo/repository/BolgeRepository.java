package com.example.demo.repository;

import com.example.demo.model.Bolge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BolgeRepository extends JpaRepository<Bolge,Long> {

    @Query("SELECT name  FROM Bolge")
    String[] bolgeler();
}

