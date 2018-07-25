package com.example.demo.service;

import com.example.demo.model.Sehir;
import com.example.demo.repository.SehirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SehirServiceImpl implements SehirService {
    @Autowired
    SehirRepository sehirRepository;


    @Override
    public Sehir FindById(Long id) {
        return sehirRepository.FindById(id);
    }

    @Override
    public List<Sehir> findAll() {
        return sehirRepository.findAll();
    }

    @Override
    public void delete(Sehir sehir) {
        sehirRepository.delete(sehir);
    }
}
