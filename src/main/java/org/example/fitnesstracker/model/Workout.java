package org.example.fitnesstracker.model;

import jakarta.persistence.*;

@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;     // RUNNING, GYM, etc.
    private int duration;    // minutes
    private int calories;    // kcal

    public Workout() {
    }

    public Workout(String type, int duration, int calories) {
        this.type = type;
        this.duration = duration;
        this.calories = calories;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
