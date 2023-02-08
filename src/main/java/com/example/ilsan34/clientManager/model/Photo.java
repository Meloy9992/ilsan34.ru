package com.example.ilsan34.clientManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "photo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_photo")
    private Long id;

    @Column(name = "photo")
    @Lob
    private byte[] photo;

    @OneToOne(mappedBy = "photo", cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Publicist publicist;

    @OneToOne(mappedBy = "photo", cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private  Trainer trainer;

    @ManyToOne(fetch = FetchType.LAZY)
    private News news;
}
