package com.fittrainer.objects;

/**
 * DTO representing a day in a fitness plan, including day number, weekday, type (rest or training),
 * references to meal and workout templates, week number, and an optional note.
 */
public class Day {

    private DayOfWeek day;
    private String weekday;
    private DayType type;             // "rest" or "training"
    private String mealsTemplate;   // reference to meal template
    private String workoutTemplate; // reference to workout template
    private int week;
    private String note;             // optional

    public DayOfWeek getDay() {
        return day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public DayType getType() {
        return type;
    }

    public void setType(DayType type) {
        this.type = type;
    }

    public String getMealsTemplate() {
        return mealsTemplate;
    }

    public void setMeals_template(String meals_template) {
        this.mealsTemplate = meals_template;
    }

    public String getWorkout_template() {
        return workoutTemplate;
    }

    public void setWorkout_template(String workout_template) {
        this.workoutTemplate = workout_template;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}