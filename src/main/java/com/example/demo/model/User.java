package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;
    @Column(name = "login")
    @NonNull
    private String login;
    @NonNull
    @OneToOne
    @JoinColumn(name = "role_id",referencedColumnName = "user_role_id")
    private Role role;
}
