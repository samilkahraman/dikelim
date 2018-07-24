package com.example.demo.service;

import com.example.demo.model.Agac_Turu;
import com.example.demo.repository.Agac_TuruRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Agac_turuServiceImpl implements Agac_turuService {
    @Autowired
    Agac_TuruRepository agac_turuRepository;



    @Override
    public Agac_Turu findbyId(Long id) {
        return agac_turuRepository.findbyId(id);
    }

    @Override
    public Agac_Turu findbyname(String tur) {
     return    agac_turuRepository.findbyname(tur);
    }
}
