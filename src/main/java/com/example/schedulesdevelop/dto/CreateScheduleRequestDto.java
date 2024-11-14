package com.example.schedulesdevelop.dto;

import lombok.Getter;

@Getter
public class CreateScheduleRequestDto {

    private final String title;

    private final String todo;

    private final String username;

    public CreateScheduleRequestDto(String title, String todo, String username) {
        this.title = title;
        this.todo = todo;
        this.username = username;
    }
}
