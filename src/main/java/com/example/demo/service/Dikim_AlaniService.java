package com.example.demo.service;

import com.example.demo.model.Dikim_Alani;

import java.util.List;

public interface Dikim_AlaniService {

    List<Dikim_Alani> findAll();

    Dikim_Alani FindById(Long id);


    Dikim_Alani findbyIsim(String isim);

    Dikim_Alani findByDikim_alani_id(Long id);

    void delete(Dikim_Alani dikim_alani);



}
