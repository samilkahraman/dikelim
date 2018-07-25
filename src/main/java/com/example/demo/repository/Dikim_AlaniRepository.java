package com.example.demo.repository;

import com.example.demo.model.Agac_Turu;
import com.example.demo.model.Dikim_Alani;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Dikim_AlaniRepository extends JpaRepository<Dikim_Alani,Long> {


    @Query("SELECT  k FROM Dikim_Alani k WHERE k.isim=?1")
    Dikim_Alani findbyIsim(String name);

    @Query("SELECT  k FROM Dikim_Alani k WHERE k.dikim_alani_id=?1")
    Dikim_Alani findByDikim_alani_id(Long id);

    @Query("SELECT  s FROM Dikim_Alani s WHERE s.id=?1")
    Dikim_Alani FindById(Long id);
}
