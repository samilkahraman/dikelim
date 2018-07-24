package com.example.demo.repository;

import com.example.demo.model.Agac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AgacRepository extends JpaRepository<Agac,Long> {

    @Query("SELECT COUNT(id) FROM Agac ")
    int toplamAgac();
}
