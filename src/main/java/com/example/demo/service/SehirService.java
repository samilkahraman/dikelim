package com.example.demo.service;

import com.example.demo.model.Sehir;

import java.util.List;

public interface SehirService {

    Sehir FindById(Long id);

    List<Sehir> findAll();
}
