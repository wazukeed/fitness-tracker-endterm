package org.example.fitnesstracker.controller;

import org.example.fitnesstracker.model.Workout;
import org.example.fitnesstracker.service.WorkoutService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books/")
public class WorkoutController {

    private final WorkoutService service;

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Workout create(@RequestBody Workout workout) {
        return service.create(workout);
    }

    // READ ALL
    @GetMapping
    public List<Workout> getAll() {
        return service.getAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Workout getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Workout update(@PathVariable Long id, @RequestBody Workout workout) {
        return service.update(id, workout);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @DeleteMapping("/cache")
    public void clearCache() {
        service.clearCache();
    }
}
