package com.example.democourses.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "lookup_skills")
@Data
public class Skill  extends BaseEntity{


    private String name;

    @ManyToMany (mappedBy = "skills")
    private List<Trainer> trainers;
}
