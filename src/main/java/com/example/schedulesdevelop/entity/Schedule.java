package com.example.schedulesdevelop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String todo;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
