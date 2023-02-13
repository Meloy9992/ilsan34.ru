package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "registration_for_lesson")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistrationForLesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "comment")
    private String comment;
}
