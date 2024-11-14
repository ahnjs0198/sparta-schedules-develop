package com.example.schedulesdevelop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String email;
}
