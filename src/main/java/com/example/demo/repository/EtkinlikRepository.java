package com.example.demo.repository;

import com.example.demo.model.Etkinlik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EtkinlikRepository extends JpaRepository<Etkinlik,Long> {
    @Query("SELECT  e FROM Etkinlik e WHERE e.id=?1")
    Etkinlik findbyId(Long id);
}

