package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sehir")
public class Sehir {
    private String id;
    private String name;
    private Bolge bolge;
    private Set<Dikim_Alani> dikim_alani_set;


    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    public Set<Dikim_Alani> getDikim_alani_set() {
        return dikim_alani_set;
    }

    public void setDikim_alani_set(Set<Dikim_Alani> dikim_alani_set) {
        this.dikim_alani_set = dikim_alani_set;
    }
}
