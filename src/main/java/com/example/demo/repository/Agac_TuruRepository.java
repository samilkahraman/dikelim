package com.example.demo.repository;

import com.example.demo.model.Agac_Turu;
import com.example.demo.model.Dikim_Alani;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Agac_TuruRepository extends JpaRepository<Agac_Turu,Long> {


    @Query("SELECT  k FROM Agac_Turu k WHERE k.agac_turu_id=?1")
    Agac_Turu findbyId(Long id);

    @Query("SELECT  k FROM Agac_Turu k WHERE k.isim=?1")
    Agac_Turu findbyname(String name);
}
