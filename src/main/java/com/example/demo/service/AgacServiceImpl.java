package com.example.demo.service;

import com.example.demo.model.Agac;
import com.example.demo.repository.AgacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Agac> findAll() {
        return agacRepository.findAll();
    }

    @Override
    public Agac FindById(Long id) {
        return agacRepository.FindById(id);
    }

    @Override
    public void delete(Agac agac) {
        agacRepository.delete(agac);
    }
}
