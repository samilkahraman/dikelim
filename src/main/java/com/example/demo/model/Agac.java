package com.example.demo.model;
import javax.persistence.*;
import java.util.Set;


@Entity
@Inheritance
@Table(name="agac")
public abstract class Agac {

    private long id;

    private String email;

    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}