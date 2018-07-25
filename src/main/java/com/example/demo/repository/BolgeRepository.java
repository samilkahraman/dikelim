package com.example.demo.repository;

import com.example.demo.model.Bolge;
import com.example.demo.model.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BolgeRepository extends JpaRepository<Bolge,Long> {

    @Query("SELECT  s FROM Bolge s WHERE s.id=?1")
    Bolge FindById(Long id);
}
