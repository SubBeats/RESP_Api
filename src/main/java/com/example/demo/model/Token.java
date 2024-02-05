package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name = "persistent_logins")
@Data
public class Token {

    @Id
    private String series;

    private String username;

    private String token;

    private Timestamp lastUsed;
}