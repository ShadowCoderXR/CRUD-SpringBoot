package com.example.crudexample.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.PrivateKey;

@Data
@Entity
@Table(name="tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name="email_address", unique = true, nullable = false)
    private String email;
}
