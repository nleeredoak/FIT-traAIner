package com.fittrainer.objects.templates;

/**
 * DTO representing a workout with type and duration in minutes.
 */
public class WorkoutTemplate {

    private String type;
    private int durationMinutes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}