package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Training {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int year;
    private int duration;
    private double budget;

    @ManyToOne
    private Domain domain;

    @ManyToMany
    @JoinTable(
            name = "training_participant",
            joinColumns = @JoinColumn(name = "training_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private List<Participant> participants;
}
