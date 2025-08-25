package com.fittrainer.objects.templates;

import com.fittrainer.objects.Macros;
import com.fittrainer.objects.Meal;

import java.util.List;

/**
 * DTO representing a meal template with total calories, macros, and a list of meals.
 */
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