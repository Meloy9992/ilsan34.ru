package com.example.ilsan34.clientManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sports_hall")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SportHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sports_hall")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "information")
    private String information;

    @ManyToOne(fetch = FetchType.LAZY)
    private Trainer trainer;
}
