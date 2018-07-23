package com.example.demo.service;

import com.example.demo.repository.BolgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BolgeServiceImpl implements BolgeService {

    @Autowired
    BolgeRepository bolgeRepository;
}
