package com.example.demo.repository;

import com.example.demo.model.Agac;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AgacRepository extends JpaRepository<Agac,Long> {

    @Query("SELECT COUNT(id) FROM Agac ")
    int toplamAgac();
/*
    @Query("select Count(ag.adanan_kisi) from Agac ag inner join ag.dikim_alani dk inner join " +
            "where ar.idArea = :idArea") */

    /*@Query("Select  Count(ag.adanan_kisi) from Agac ag, Dikim_Alani dk, " +
            "Sehir sh, Bolge bg where ag.dikim_alani=dk " +
            "and dk.sehir_id=sh.id and sh.bolge_id=bg.id and bg.id=0")
    int metot();*/
}
