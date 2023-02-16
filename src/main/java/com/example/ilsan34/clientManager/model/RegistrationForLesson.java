package com.example.ilsan34.clientManager.model;

import javax.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.Optional;

@Entity
@Table(name = "registration_for_lesson")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegistrationForLesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registration_for_lesson")
    private BigInteger id;

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

    public RegistrationForLesson(String firstName, String lastName, Long phoneNumber, String email, String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.comment = comment;
    }

    public RegistrationForLesson(String firstName, String lastName, Long phoneNumber, Optional<String> email, Optional<String> comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email.get();
        this.comment = comment.get();
    }
}
