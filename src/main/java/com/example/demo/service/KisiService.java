package com.example.demo.service;

import com.example.demo.model.Kisi;

import java.util.Date;
import java.util.List;

public interface KisiService {


    void save(Kisi kisi);

    Kisi findByKullaniciAdi(String username);
    Kisi FindById(Long id);
    Kisi findBySifre(String sifre);
    int toplamKullanici();
    int[]  kullaniciAgaclarCoktanAza();
    String[] kullaniciAgaclariCoktanAzaIsimleri();
    Date[] kullaniciDogumlari();

    List<Kisi> findAll();

    void delete(Kisi kisi);
}
