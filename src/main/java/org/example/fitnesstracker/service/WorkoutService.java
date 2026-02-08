package org.example.fitnesstracker.service;

import org.example.fitnesstracker.repository.WorkoutRepository;
import org.example.fitnesstracker.model.Workout;
import org.example.fitnesstracker.exception.WorkoutNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository repository;

    public WorkoutService(WorkoutRepository repository) {
        this.repository = repository;
    }

    public Workout create(Workout workout) {
        return repository.save(workout);
    }

    public List<Workout> getAll() {
        return repository.findAll();
    }

    public Workout getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new WorkoutNotFoundException(id));
    }

    public Workout update(Long id, Workout workout) {
        Workout existing = getById(id);
        existing.setType(workout.getType());
        existing.setDuration(workout.getDuration());
        existing.setCalories(workout.getCalories());
        return repository.save(existing);
    }

    public void delete(Long id) {
        Workout existing = getById(id);
        repository.delete(existing);
    }
}
