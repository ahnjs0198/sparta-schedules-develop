package com.example.schedulesdevelop.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
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

    public Schedule() {
    }

    public Schedule(String title, String todo) {
        this.title = title;
        this.todo = todo;
    }

    public void setMember(Member member) {
        this.member = member;
    }

}
