package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sehir")
public class Sehir {
    private Long id;
    private String name;
    private Bolge bolge;
    private Set<Dikim_Alani> dikimAlan;


    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "bolge_id")
    public Bolge getBolge() {
        return bolge;
    }

    public void setBolge(Bolge bolge) {
        this.bolge = bolge;
    }

    @OneToMany(mappedBy = "sehir", cascade = CascadeType.ALL)
    public Set<Dikim_Alani> getDikimAlan() {
        return dikimAlan;
    }
    public void setDikimAlan(Set<Dikim_Alani> dikimAlan) {
        this.dikimAlan = dikimAlan;
    }
}