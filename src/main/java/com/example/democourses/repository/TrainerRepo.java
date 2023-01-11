package com.example.democourses.repository;

import com.example.democourses.Entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepo extends JpaRepository<Trainer, UUID> {
}
