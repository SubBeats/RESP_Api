package com.example.demo.model;

import jakarta.persistence.*;

@Entity(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_role_id")
    private Long user_role_id ;
    @Column(name = "username")
    private String username;
    @Column(name = "role")

    private String role;
    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName = "user_id")
    private User user;
}