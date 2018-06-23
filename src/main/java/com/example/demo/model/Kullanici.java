package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="kullanici")
public class Kullanici  {


    private Long id;


    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }
}
