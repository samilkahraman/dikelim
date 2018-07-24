package com.example.demo.service;

import com.example.demo.model.Kisi;

public interface KisiService {


    void save(Kisi kisi);

    Kisi findByKullaniciAdi(String username);
    Kisi findById(Long id);
    Kisi findBySifre(String sifre);
    Kisi deleteByKullaniciAdi(String username);
}
