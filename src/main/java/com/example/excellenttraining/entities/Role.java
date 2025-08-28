package com.example.excellenttraining.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Role {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "role")
    private List<AppUser> appUsers;
}
