package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long user_role_id ;
    @Column(name = "username")
    @NonNull
    private String username;
    @Column(name = "role")
    @NonNull
    private String role;
    @NonNull
    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private User user;
}