package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Domain {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libel;

    @OneToMany(mappedBy = "domain")
    private List<Training> trainings;
}
