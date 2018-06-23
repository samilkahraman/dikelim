package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "agac_turu")
public class Agac_Turu {
    private String aciklama;
    private String isim;
    private Long agac_turu_id;
    private Set<Dikim_Alani> dikim_alani_set;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getAgac_turu_id() {
        return agac_turu_id;
    }

    public void setAgac_turu_id(Long agac_turu_id) {
        this.agac_turu_id = agac_turu_id;
    }


    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



    @ManyToMany
    @JoinTable(name = "dikilirler",joinColumns = @JoinColumn(name = "agac_turu_id"), inverseJoinColumns = @JoinColumn(name = "dikim_alani_id"))
    public Set<Dikim_Alani> getDikim_alani_set() {
        return dikim_alani_set;
    }

    public void setDikim_alani_set(Set<Dikim_Alani> dikim_alani_set) {
        this.dikim_alani_set = dikim_alani_set;
    }
}