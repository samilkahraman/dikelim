package com.example.demo.service;

import com.example.demo.model.Etkinlik;
import com.example.demo.repository.EtkinlikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtkinlikServiceImpl implements EtkinlikService {
    @Autowired
    EtkinlikRepository etkinlikRepository;
    @Override
    public List<Etkinlik> findAll() {
        return etkinlikRepository.findAll();
    }

    @Override
    public Etkinlik findbyId(Long id) {
        return etkinlikRepository.findbyId(id);
    }
}
