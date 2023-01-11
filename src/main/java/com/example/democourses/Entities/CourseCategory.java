package com.example.democourses.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "lookup_course_category")
@Data
public class CourseCategory extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
