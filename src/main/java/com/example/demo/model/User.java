package com.example.demo.model;

import jakarta.persistence.*;
@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;
    @Column(name = "login")
    private String login;
    @OneToOne
    @JoinColumn(name = "role_id",referencedColumnName = "user_role_id")
    private Role role;
}
