package com.example.schedulesdevelop.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

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
        super.createdAt = LocalDateTime.now();
        super.modifiedAt = LocalDateTime.now();
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void updateTodo(String todo) {
        this.todo = todo;
        super.modifiedAt = LocalDateTime.now();
    }

    public void updateTitle(String title) {
        this.title = title;
        super.modifiedAt = LocalDateTime.now();
    }
}
