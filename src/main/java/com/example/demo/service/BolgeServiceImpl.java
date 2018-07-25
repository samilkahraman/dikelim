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

    public Bolge FindById(Long id) {
        return bolgeRepository.FindById(id);
    }
        @Override
        public String[] bolgeler () {
            String[] test = bolgeRepository.bolgeler();

            return test;
        }


        @Override
        public List<Bolge> findAll () {
            return bolgeRepository.findAll();
        }

        @Override
        public void delete (Bolge bolge){
            bolgeRepository.delete(bolge);
        }
    }
