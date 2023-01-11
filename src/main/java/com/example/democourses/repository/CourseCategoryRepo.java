package com.example.democourses.repository;

import com.example.democourses.Entities.CourseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseCategoryRepo extends JpaRepository<CourseCategory, UUID> {
}
