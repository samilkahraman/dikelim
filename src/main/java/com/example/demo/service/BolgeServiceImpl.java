package com.example.demo.service;

import com.example.demo.model.Bolge;
import com.example.demo.repository.BolgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BolgeServiceImpl implements BolgeService {

    @Autowired
    BolgeRepository bolgeRepository;

    @Override
    public String[] bolgeler() {
        String[] test=bolgeRepository.bolgeler();
       // String[] bolgeler = new String[bolgeRepository.bolgeler().length];
       // for(int i=0;i<bolgeRepository.bolgeler().length;i++){
        //    bolgeler[i]=test
        //}
        return test;
    }

    @Override
    public Optional<Bolge> findById(Long id) {
        return bolgeRepository.findById(id);
    }

    @Override
    public List<Bolge> findAll() {
        return bolgeRepository.findAll();
    }
}
