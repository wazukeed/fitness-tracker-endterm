package org.example.fitnesstracker.patterns.factory;

import org.example.fitnesstracker.model.Workout;

public class YogaWorkoutFactory implements WorkoutFactory {

    @Override
    public Workout createWorkout() {
        Workout workout = new Workout();
        workout.setType("YOGA");
        workout.setDuration(45);
        workout.setCalories(150);
        return workout;
    }
}

