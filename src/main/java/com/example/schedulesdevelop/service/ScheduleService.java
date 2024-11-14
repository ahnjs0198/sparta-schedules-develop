package com.example.schedulesdevelop.service;

import com.example.schedulesdevelop.dto.ScheduleResponseDto;
import com.example.schedulesdevelop.entity.Member;
import com.example.schedulesdevelop.entity.Schedule;
import com.example.schedulesdevelop.repository.MemberRepository;
import com.example.schedulesdevelop.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final MemberRepository memberRepository;
    private final ScheduleRepository scheduleRepository;

    public ScheduleResponseDto save(String title, String todo, String username) {

        Member findMember = memberRepository.findMemberByUsernameOrElseThrow(username);

        Schedule schedule = new Schedule(title, todo);
        schedule.setMember(findMember);

        Schedule savedSchedule = scheduleRepository.save(schedule);

        return new ScheduleResponseDto(savedSchedule.getId(), savedSchedule.getTitle(), savedSchedule.getTodo());
    }

    public List<ScheduleResponseDto> findAll() {
        return scheduleRepository.findAll().stream().map(ScheduleResponseDto::toDto).toList();
    }

    public ScheduleResponseDto findById(Long id) {

        Schedule findSchedule = scheduleRepository.findByIdOrElseThrow(id);

        return new ScheduleResponseDto(findSchedule.getId(),findSchedule.getTitle(), findSchedule.getTodo());
    }

    public ScheduleResponseDto updateSchedule(Long id, String title, String todo) {

        Schedule findSchedule = scheduleRepository.findByIdOrElseThrow(id);

        findSchedule.updateTitle(title);
        findSchedule.updateTodo(todo);

        Schedule savedSchedule = scheduleRepository.save(findSchedule);

        return new ScheduleResponseDto(savedSchedule.getId(),savedSchedule.getTitle(), savedSchedule.getTodo());
    }

    public void delete(Long id) {

        Schedule findSchedule = scheduleRepository.findByIdOrElseThrow(id);

        scheduleRepository.delete(findSchedule);
    }

}
