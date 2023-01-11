package com.example.democourses.Entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
@Data
public class Course extends BaseEntity {
    private String title;
    private String description;
    private int maxNumOfAttendees;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CourseCategory category;
}
