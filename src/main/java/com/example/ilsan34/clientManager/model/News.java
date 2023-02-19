package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import java.math.BigInteger;
import java.util.*;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_news")
    private BigInteger id;

    @Column(name = "name_news")
    private String name;

    @Column(name = "description_news")
    private String description;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_publication")
    private Date date;

    @OneToMany(mappedBy = "news", cascade = CascadeType.ALL)
    private List<Photo> photo = new ArrayList<>();

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_publicist")
    private Publicist publicist;
}
