package com.example.democourses.repository;

import com.example.democourses.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepo extends JpaRepository<Course, UUID> {
}
