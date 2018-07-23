package com.example.demo.repository;

import com.example.demo.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KisiRepository extends JpaRepository<Kisi, Long> {


    @Query("SELECT  k FROM Kisi k WHERE k.kullaniciAdi=?1")
    Kisi findByKullaniciAdi(String username);
    @Query("SELECT  k FROM Kisi k WHERE k.id=?1")
    Kisi findbyId(Long id);
}
