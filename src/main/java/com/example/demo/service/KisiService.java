package com.example.demo.service;

import com.example.demo.model.Kisi;

import java.util.List;

public interface KisiService {


    void save(Kisi kisi);

    Kisi findByKullaniciAdi(String username);
    Kisi findById(Long id);
    Kisi findBySifre(String sifre);
    int toplamKullanici();

    List<Kisi> findAll();

    void delete(Kisi kisi);
}
