package com.example.democourses.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "trainer")
@Data
public class Trainer extends BaseEntity {

    private String fName;
    private String lName;
    private LocalDateTime birthdate;
    private LocalDateTime workStartDate;
    private String email;
    private String phone;



    @OneToMany(mappedBy = "trainer")
    private List<CourseInstance> courseInstances;


    @ManyToMany
    @JoinTable(
            name = "trainer_skills",
            joinColumns = @JoinColumn (name = "trainer_id",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "ID")
    )
    private List<Skill> skills;



}
