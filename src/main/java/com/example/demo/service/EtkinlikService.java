package com.example.demo.service;

import com.example.demo.model.Etkinlik;

import java.util.List;

public interface EtkinlikService {
    List<Etkinlik> findAll();

    Etkinlik findbyId(Long id);

    void delete(Etkinlik etkinlik);

}

