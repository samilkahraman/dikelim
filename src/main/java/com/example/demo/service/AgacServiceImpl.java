package com.example.demo.service;

import com.example.demo.model.Agac;
import com.example.demo.repository.AgacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgacServiceImpl implements AgacService {
    @Autowired
    AgacRepository agacRepository;
    @Override
    public void save(Agac agac) {
        agacRepository.save(agac);
    }

    @Override
    public int toplamAgac() {
        return agacRepository.toplamAgac();
    }
}
