package com.example.democourses.repository;

import com.example.democourses.Entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SkillRepo extends JpaRepository<Skill, UUID> {
}
