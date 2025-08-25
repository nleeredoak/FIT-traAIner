package com.fitnesstrainer.dto.templates;

import com.fitnesstrainer.dto.Macros;
import com.fitnesstrainer.dto.Meal;

import java.util.List;

public class MealTemplate {

    private int calories;
    private Macros macros;
    private List<Meal> meals;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Macros getMacros() {
        return macros;
    }

    public void setMacros(Macros macros) {
        this.macros = macros;
    }
}