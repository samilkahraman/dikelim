package com.example.demo.service;

import com.example.demo.model.Kullanici;
import com.example.demo.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciServiceImpl implements KullaniciService {
    @Autowired
    KullaniciRepository kullaniciRepository;

    @Override
    public void save(Kullanici kullanici) {
        kullaniciRepository.save(kullanici);
    }
}


