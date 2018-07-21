package com.example.demo.service;

import com.example.demo.model.Kisi;
import com.example.demo.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisiServiceImpl implements KisiService {
    @Autowired
    KisiRepository kisiRepository;



    @Override
    public void save(Kisi kisi) {
            kisiRepository.save(kisi);
        }

    @Override
    public Kisi findByKullaniciAdi(String username) {
        return kisiRepository.findByKullaniciAdi(username);
    }
}

