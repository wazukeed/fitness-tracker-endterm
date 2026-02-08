package org.example.fitnesstracker.patterns.builder;

import org.example.fitnesstracker.model.Workout;

public class WorkoutBuilder {

    private String type;
    private int duration;
    private int calories;

    public WorkoutBuilder type(String type) {
        this.type = type;
        return this;
    }

    public WorkoutBuilder duration(int duration) {
        this.duration = duration;
        return this;
    }

    public WorkoutBuilder calories(int calories) {
        this.calories = calories;
        return this;
    }

    public Workout build() {
        Workout workout = new Workout();
        workout.setType(type);
        workout.setDuration(duration);
        workout.setCalories(calories);
        return workout;
    }
}

