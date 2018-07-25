package com.example.demo.repository;

import com.example.demo.model.Agac_Turu;
import com.example.demo.model.Etkinlik;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtkinlikRepository extends JpaRepository<Etkinlik,Long> {

}

