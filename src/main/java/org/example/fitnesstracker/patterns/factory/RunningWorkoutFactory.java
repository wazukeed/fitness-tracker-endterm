package org.example.fitnesstracker.patterns.factory;

import org.example.fitnesstracker.model.Workout;

public class RunningWorkoutFactory implements WorkoutFactory {

    @Override
    public Workout createWorkout() {
        Workout workout = new Workout();
        workout.setType("RUNNING");
        workout.setDuration(30);
        workout.setCalories(300);
        return workout;
    }
}
