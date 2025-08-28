package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libel;

    @OneToMany(mappedBy = "profile")
    private List<Participant> participants;
}
