package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dikim_alani")
public class Dikim_Alani {
    private String isim;
    private Long kapasite;
    private String toprak_yapisi;
    private Long tahmini_sulama_sikligi;
    private Long dikim_alani_id;
    private Set<Agac_Turu> agac_turu_set;
    private Set<Agac> agacSet;
    private Set<Etkinlik> etkinlikSet;
    private Long sehir_id;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getDikim_alani_id() {
        return dikim_alani_id;
    }

    public void setDikim_alani_id(Long dikim_alani_id) {
        this.dikim_alani_id = dikim_alani_id;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Long getKapasite() {
        return kapasite;
    }

    public void setKapasite(Long kapasite) {
        this.kapasite = kapasite;
    }

    public String getToprak_yapisi() {
        return toprak_yapisi;
    }

    public void setToprak_yapisi(String toprak_yapisi) {
        this.toprak_yapisi = toprak_yapisi;
    }

    public Long getTahmini_sulama_sikligi() {
        return tahmini_sulama_sikligi;
    }

    public void setTahmini_sulama_sikligi(Long tahmini_sulama_sikligi) {
        this.tahmini_sulama_sikligi = tahmini_sulama_sikligi;
    }




    @ManyToMany(mappedBy = "dikim_alani_set")
    public Set<Agac_Turu> getAgac_turu_set() {
        return agac_turu_set;
    }

    public void setAgac_turu_set(Set<Agac_Turu> agac_turu_set) {
        this.agac_turu_set = agac_turu_set;
    }

    @OneToMany(mappedBy = "dikim_alani", cascade = CascadeType.ALL)
    public Set<Agac> getAgacSet() {
        return agacSet;
    }

    public void setAgacSet(Set<Agac> agacSet) {
        this.agacSet = agacSet;
    }

    @OneToMany(mappedBy = "dikim_alani")
    public Set<Etkinlik> getEtkinlikSet() {
        return etkinlikSet;
    }

    public void setEtkinlikSet(Set<Etkinlik> etkinlikSet) {
        this.etkinlikSet = etkinlikSet;
    }


    public Long getSehir_id() {
        return sehir_id;
    }

    public void setSehir_id(Long sehir_id) {
        this.sehir_id = sehir_id;
    }
}