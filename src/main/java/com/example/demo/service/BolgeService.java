package com.example.demo.service;

import com.example.demo.model.Bolge;

import java.util.List;

public interface BolgeService {

    Bolge FindById(Long id);
    void delete(Bolge bolge);

    List<Bolge> findAll();

String[] bolgeler();

}
