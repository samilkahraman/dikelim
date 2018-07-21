package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="kullanici")
@PrimaryKeyJoinColumn(name = "kisi_id")
public class Kullanici extends Kisi  {


    private Long puan;



    public Long getPuan() {
        return puan;
    }

    public void setPuan(Long puan) {
        this.puan = puan;
    }
}

