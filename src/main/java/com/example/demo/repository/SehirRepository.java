package com.example.demo.repository;

import com.example.demo.model.Sehir;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SehirRepository extends JpaRepository<Sehir,Long> {
}
