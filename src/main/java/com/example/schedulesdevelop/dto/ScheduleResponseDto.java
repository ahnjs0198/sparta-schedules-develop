package com.example.schedulesdevelop.dto;

import com.example.schedulesdevelop.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;

    private final String title;

    private final String todo;

    private final LocalDateTime createdAt;

    private final LocalDateTime modifiedAt;

    public ScheduleResponseDto(Long id, String title, String todo, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.todo = todo;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public static ScheduleResponseDto toDto(Schedule schedule) {
        return new ScheduleResponseDto(schedule.getId(), schedule.getTitle(), schedule.getTodo(), schedule.getCreatedAt(), schedule.getModifiedAt());
    }
}
