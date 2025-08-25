package com.fittrainer.objects;

import com.fittrainer.objects.templates.MealTemplate;
import com.fittrainer.objects.templates.WorkoutTemplate;

import java.util.Map;

/**
 * DTO representing templates for meals and workouts in a fitness plan.
 */
public class Templates {

    private Map<String, MealTemplate> meals; // "training_day", "rest_day"
    private Map<String, WorkoutTemplate> workouts;   // keyed by weekday

    public Map<String, MealTemplate> getMeals() {
        return meals;
    }

    public void setMeals(Map<String, MealTemplate> meals) {
        this.meals = meals;
    }

    public Map<String, WorkoutTemplate> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Map<String, WorkoutTemplate> workouts) {
        this.workouts = workouts;
    }
}
