package com.example.democourses.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "course_instance")
@Data
public class CourseInstance extends BaseEntity {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int startHour;
    private int endHour;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
