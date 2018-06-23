package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Tree")
public class Tree {

    private String id;
    private String name;



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
}
