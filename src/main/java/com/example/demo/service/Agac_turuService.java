package com.example.demo.service;

import com.example.demo.model.Agac_Turu;
import com.example.demo.model.Dikim_Alani;

import java.util.List;

public interface Agac_turuService {

    Agac_Turu findbyId(Long id);


    Agac_Turu findbyname(String tur);


    List<Agac_Turu> findAll();

    void delete(Agac_Turu agac_turu);

}
