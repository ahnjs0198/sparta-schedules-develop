package com.example.schedulesdevelop.dto;

import lombok.Getter;

@Getter
public class UpdateScheduleRequestDto {

    private final String username;

    private final String title;

    private final String todo;

    public UpdateScheduleRequestDto(String username, String title, String todo) {
        this.username = username;
        this.title = title;
        this.todo = todo;
    }
}
