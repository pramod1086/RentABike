package com.pramod.rentabike.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "gender")
    private String gender;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "birth")
    private Date birth;

    @Column(name = "role")
    private Integer role;
}
