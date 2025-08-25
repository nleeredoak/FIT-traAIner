package com.fitnesstrainer.dto;

public class Day {

    private int day;
    private String weekday;
    private String type;             // "rest" or "training"
    private String meals_template;   // reference to meal template
    private String workout_template; // reference to workout template
    private int week;
    private String note;             // optional

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeals_template() {
        return meals_template;
    }

    public void setMeals_template(String meals_template) {
        this.meals_template = meals_template;
    }

    public String getWorkout_template() {
        return workout_template;
    }

    public void setWorkout_template(String workout_template) {
        this.workout_template = workout_template;
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