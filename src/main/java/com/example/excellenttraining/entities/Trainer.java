package com.example.excellenttraining.entities;
import jakarta.persistence.*;


@Entity
public class Trainer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String type; // interne ou externe

    @ManyToOne
    private Employer employer;
}
