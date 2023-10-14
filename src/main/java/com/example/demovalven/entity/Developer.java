package com.example.demovalven.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    @OneToMany(mappedBy = "developer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CommitList> commits;

    // Constructors, Getter and Setter methods
    // toString and other custom methods
}
