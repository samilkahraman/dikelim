package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//etkinlik_id ,isim,katılım sayısı,tarih,açıklama,dikim alani,agac
@Entity
@Table(name="etkinlik")
public class Etkinlik {
    private Long id;
    private String isim;
    private Long katılım_sayisi;
    private Date tarih;
    private String aciklama;
    private Dikim_Alani dikim_alani;
    private Set<Agac> agacSet;
    private Set<Kisi> kisiSet;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Long getKatılım_sayisi() {
        return katılım_sayisi;
    }

    public void setKatılım_sayisi(Long katılım_sayisi) {
        this.katılım_sayisi = katılım_sayisi;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @ManyToOne
    @JoinColumn(name = "dikim_alani_id")
    public Dikim_Alani getDikim_alani() {
        return dikim_alani;
    }

    public void setDikim_alani(Dikim_Alani dikim_alani) {
        this.dikim_alani = dikim_alani;
    }

    @OneToMany(mappedBy = "etkinlik", cascade = CascadeType.ALL)
    public Set<Agac> getAgacSet() {
        return agacSet;
    }

    public void setAgacSet(Set<Agac> agacSet) {
        this.agacSet = agacSet;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "katilim", joinColumns = @JoinColumn(name = "etkinlik_id"), inverseJoinColumns = @JoinColumn(name = "kisi_id"))
    public Set<Kisi> getKisiSet() {
        return kisiSet;
    }

    public void setKisiSet(Set<Kisi> kisiSet) {
        this.kisiSet = kisiSet;
    }

    /*@Override
    public String toString() {
        return this.getIsim()+" "+this.getAciklama()+ " "+this.getKatılım_sayisi()+" "+this.getDikim_alani().getIsim();

    }*/


}
