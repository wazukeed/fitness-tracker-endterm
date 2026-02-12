package org.example.fitnesstracker.service;

import org.example.fitnesstracker.cache.WorkoutCache;
import org.example.fitnesstracker.exception.WorkoutNotFoundException;
import org.example.fitnesstracker.model.Workout;
import org.example.fitnesstracker.repository.WorkoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    private final WorkoutRepository repository;

    private final WorkoutCache cache = WorkoutCache.getInstance();

    public WorkoutService(WorkoutRepository repository) {
        this.repository = repository;
    }

    public Workout create(Workout workout) {
        Workout saved = repository.save(workout);

        cache.invalidateAll();
        return saved;
    }

    public List<Workout> getAll() {
        if (cache.hasAllWorkouts()) {
            return cache.getAllWorkouts();
        }

        List<Workout> workouts = repository.findAll();
        cache.setAllWorkouts(workouts);
        return workouts;
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

        Workout saved = repository.save(existing);

        cache.invalidateAll();
        return saved;
    }

    public void delete(Long id) {
        Workout existing = getById(id);
        repository.delete(existing);

        cache.invalidateAll();
    }

    public void clearCache() {
        cache.clear();
    }
}
