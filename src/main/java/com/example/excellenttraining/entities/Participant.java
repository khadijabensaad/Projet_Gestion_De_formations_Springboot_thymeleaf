package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Participant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String tel;

    @ManyToOne
    private Structure structure;

    @ManyToOne
    private Profile profile;

    @ManyToMany(mappedBy = "participants")
    private List<Training> trainings;
}
