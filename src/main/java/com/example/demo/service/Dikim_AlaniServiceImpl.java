package com.example.demo.service;

import com.example.demo.model.Dikim_Alani;
import com.example.demo.repository.Dikim_AlaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dikim_AlaniServiceImpl implements Dikim_AlaniService {
    @Autowired
    Dikim_AlaniRepository dikim_alaniRepository;

    @Override
    public List<Dikim_Alani> findAll() {
        return dikim_alaniRepository.findAll();
    }

    @Override
    public Dikim_Alani findbyIsim(String isim) {
        return dikim_alaniRepository.findbyIsim(isim);
    }

    @Override
    public Dikim_Alani findByDikim_alani_id(Long id) {
        return dikim_alaniRepository.findByDikim_alani_id(id);
    }
}
