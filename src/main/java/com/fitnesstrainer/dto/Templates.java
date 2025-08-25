package com.fitnesstrainer.dto;

import com.fitnesstrainer.dto.templates.MealTemplate;
import com.fitnesstrainer.dto.templates.Workout;

import java.util.Map;

public class Templates {

    private Map<String, MealTemplate> meals; // "training_day", "rest_day"
    private Map<String, Workout> workouts;   // keyed by weekday

    public Map<String, MealTemplate> getMeals() {
        return meals;
    }

    public void setMeals(Map<String, MealTemplate> meals) {
        this.meals = meals;
    }

    public Map<String, Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Map<String, Workout> workouts) {
        this.workouts = workouts;
    }
}
