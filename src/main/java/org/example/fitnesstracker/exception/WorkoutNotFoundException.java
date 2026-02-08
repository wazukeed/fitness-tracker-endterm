package org.example.fitnesstracker.exception;

public class WorkoutNotFoundException extends RuntimeException {
    public WorkoutNotFoundException(Long id) {
        super("Workout not found: " + id);
    }
}
