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
    private Kisi diken_kisi;
    private String isim;
    private Date satin_alinma_tarihi;
    private Date dikilme_tarihi;
    private String adanan_kisi;
    private Etkinlik etkinlik;
    private String mesaj;
    private Boolean dikildi_mi;

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

    @ManyToOne
    @JoinColumn(columnDefinition="integer",name = "diken_id",nullable = true)
    public Kisi getDiken_kisi() {
        return diken_kisi;
    }

    public void setDiken_kisi(Kisi diken_kisi) {
        this.diken_kisi = diken_kisi;
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

    public Date getDikilme_tarihi() {
        return dikilme_tarihi;
    }

    public void setDikilme_tarihi(Date dikilme_tarihi) {
        this.dikilme_tarihi = dikilme_tarihi;
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

    public Boolean getDikildi_mi() {
        return dikildi_mi;
    }

    public void setDikildi_mi(Boolean dikildi_mi) {
        this.dikildi_mi = dikildi_mi;
    }
}