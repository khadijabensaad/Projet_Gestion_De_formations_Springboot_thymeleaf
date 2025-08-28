package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "employer")
    private List<Trainer> trainers;
}
