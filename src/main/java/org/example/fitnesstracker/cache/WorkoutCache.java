package org.example.fitnesstracker.cache;

import org.example.fitnesstracker.model.Workout;

import java.util.List;

public class WorkoutCache {

    private static WorkoutCache instance;

    private List<Workout> allWorkoutsCache; //
    private boolean allWorkoutsCached = false;

    private WorkoutCache() {}

    public static WorkoutCache getInstance() {
        if (instance == null) {
            instance = new WorkoutCache();
        }
        return instance;
    }

    public boolean hasAllWorkouts() {
        return allWorkoutsCached && allWorkoutsCache != null;
    }

    public List<Workout> getAllWorkouts() {
        return allWorkoutsCache;
    }

    public void setAllWorkouts(List<Workout> workouts) {
        this.allWorkoutsCache = workouts;
        this.allWorkoutsCached = true;
    }

    public void invalidateAll() {
        this.allWorkoutsCache = null;
        this.allWorkoutsCached = false;
    }

    public void clear() {
        invalidateAll();
    }
}

