package com.example.Fraud.Detection.Model;

import com.example.Fraud.Detection.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Getter
@Setter
@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String username;



    @NotBlank
    private String password;  // stored hashed with BCrypt

    @Enumerated(EnumType.STRING)
    private UserRole role;  // enum Role { USER, ADMIN }
}
