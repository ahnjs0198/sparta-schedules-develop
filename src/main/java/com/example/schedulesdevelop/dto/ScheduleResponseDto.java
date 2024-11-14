package com.example.schedulesdevelop.dto;

import com.example.schedulesdevelop.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private final Long id;

    private final String title;

    private final String todo;

    public ScheduleResponseDto(Long id, String title, String todo) {
        this.id = id;
        this.title = title;
        this.todo = todo;
    }

    public static ScheduleResponseDto toDto(Schedule schedule) {
        return new ScheduleResponseDto(schedule.getId(), schedule.getTitle(), schedule.getTodo());
    }
}
