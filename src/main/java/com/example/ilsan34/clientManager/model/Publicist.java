package com.example.ilsan34.clientManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "publicist")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Publicist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicist")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(fetch = FetchType.LAZY)
    private Photo photo;

    @OneToMany(mappedBy = "publicist", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<News> news = new ArrayList<>();

}
