package com.example.demo.service;

import com.example.demo.model.Kisi;
import org.springframework.stereotype.Service;

public interface KisiService {


    void save(Kisi kisi);

    Kisi findByKullaniciAdi(String username);
}
