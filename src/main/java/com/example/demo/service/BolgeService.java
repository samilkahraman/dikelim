package com.example.demo.service;

import com.example.demo.model.Bolge;

import java.util.List;
import java.util.Optional;

public interface BolgeService {

    Optional<Bolge> findById(Long id);

    List<Bolge> findAll();
String[] bolgeler();
}
