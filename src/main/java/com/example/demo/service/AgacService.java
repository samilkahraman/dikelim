package com.example.demo.service;

import com.example.demo.model.Agac;
import com.example.demo.model.Etkinlik;

import java.util.List;

public interface AgacService {

    void save(Agac agac);

    int toplamAgac();

    List<Agac> findAll();

    Agac FindById(Long id);
    void delete(Agac agac);

}
