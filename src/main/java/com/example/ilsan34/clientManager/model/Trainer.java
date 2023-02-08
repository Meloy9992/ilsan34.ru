package com.example.ilsan34.clientManager.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trainer")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "rank")
    private String rank;

    @Column(name = "work_exp")
    private String workExp;

    @OneToOne(fetch = FetchType.LAZY)
    private Photo photo;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private Direction direction;

    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SportHall> sportHalls = new ArrayList<>();

    @OneToMany(mappedBy = "trainer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Discipline> disciplines = new ArrayList<>();
}
