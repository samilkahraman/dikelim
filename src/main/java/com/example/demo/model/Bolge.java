package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="bolge")
public class Bolge {
    private Long id;
    private Long name;
    private String ozellikler;
    private Set<Sehir> sehirSet;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public String getOzellikler() {
        return ozellikler;
    }

    public void setOzellikler(String ozellikler) {
        this.ozellikler = ozellikler;
    }

    @OneToMany(mappedBy = "bolge", cascade = CascadeType.ALL)
    public Set<Sehir> getSehirSet() {
        return sehirSet;
    }

    public void setSehirSet(Set<Sehir> sehirSet) {
        this.sehirSet = sehirSet;
    }
}
