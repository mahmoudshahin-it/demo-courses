package com.example.democourses.repository;

import com.example.democourses.Entities.CourseInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseInstanceRepo extends JpaRepository<CourseInstance, UUID> {
}
