package com.example.demo.repository;

import com.example.demo.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface KisiRepository extends JpaRepository<Kisi, Long> {


    @Query("SELECT  k FROM Kisi k WHERE k.kullaniciAdi=?1")
    Kisi findByKullaniciAdi(String username);

    @Query("SELECT  k FROM Kisi k WHERE k.id=?1")
    Kisi FindbyId(Long id);

    @Query("SELECT  k FROM Kisi k WHERE k.password=?1")
    Kisi findBySifre(String sifre);

    @Query("SELECT COUNT(id) FROM Kisi ")
    int toplamKullanici();


    @Query(value = "Select Count(ag.id) as test  from agac ag group by(ag.satin_alan_id) order by(test) DESC",nativeQuery = true)
    int[] kullaniciAgaclarCoktanAza();

    @Query(value="SELECT ki.isim from kisi as ki left join agac as ag\n ON ki.id=ag.satin_alan_id  group by (ki.isim) order by count (*) desc", nativeQuery = true)
    String[] kullaniciAgaclariCoktanAzaIsimleri();

    @Query(value="SELECT  ki.dogum_tarihi from kisi as ki left join agac as ag\n ON ki.id=ag.satin_alan_id  group by ( ki.dogum_tarihi) order by count (*) desc", nativeQuery = true)
    Date[] kullaniciDogumlari();

    }
