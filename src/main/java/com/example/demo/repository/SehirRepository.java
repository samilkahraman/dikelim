package com.example.demo.repository;

import com.example.demo.model.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface SehirRepository extends JpaRepository<Sehir, Long>{

    @Query("SELECT  s FROM Sehir s WHERE s.id=?1")
    Sehir FindById(Long id);


}