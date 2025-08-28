package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Structure {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libel;

    @OneToMany(mappedBy = "structure")
    private List<Participant> participants;
}
