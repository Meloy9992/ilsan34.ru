package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "direction")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direction")
    private BigInteger id;

    @Column(name = "name_direction")
    private String name;

    @Column(name = "information")
    private String information;

    @OneToMany(mappedBy = "direction", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trainer> trainers = new ArrayList<>();
}
