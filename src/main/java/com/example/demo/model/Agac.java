package com.example.demo.model;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="agac")
public  class Agac {

    private long id;
    private Agac_Turu agac_turu;
    private Dikim_Alani dikim_alani;
    private Kisi satin_alan_kisi;
    private String isim;
    private Date satin_alinma_tarihi;
    private String adanan_kisi;
    private Etkinlik etkinlik;
    private String mesaj;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "agac_turu_id")
    public Agac_Turu getAgac_turu() {
        return agac_turu;
    }

    public void setAgac_turu(Agac_Turu agac_turu) {
        this.agac_turu = agac_turu;
    }

    @ManyToOne
    @JoinColumn(name = "dikim_alani_id")
    public Dikim_Alani getDikim_alani() {
        return dikim_alani;
    }

    public void setDikim_alani(Dikim_Alani dikim_alani) {
        this.dikim_alani = dikim_alani;
    }

    @ManyToOne
    @JoinColumn(name = "satin_alan_id")
    public Kisi getSatin_alan_kisi() {
        return satin_alan_kisi;
    }

    public void setSatin_alan_kisi(Kisi satin_alan_kisi) {
        this.satin_alan_kisi = satin_alan_kisi;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    public Date getSatin_alinma_tarihi() {
        return satin_alinma_tarihi;
    }

    public void setSatin_alinma_tarihi(Date satin_alinma_tarihi) {
        this.satin_alinma_tarihi = satin_alinma_tarihi;
    }


    public String getAdanan_kisi() {
        return adanan_kisi;
    }

    public void setAdanan_kisi(String adanan_kisi) {
        this.adanan_kisi = adanan_kisi;
    }

    @ManyToOne
    @JoinColumn(columnDefinition="integer",name = "etkinlik_id",nullable = true)
    public Etkinlik getEtkinlik() {
        return etkinlik;
    }

    public void setEtkinlik(Etkinlik etkinlik) {
        this.etkinlik = etkinlik;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

}