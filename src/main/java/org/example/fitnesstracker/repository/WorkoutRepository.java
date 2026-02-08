package org.example.fitnesstracker.repository;

import org.example.fitnesstracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
