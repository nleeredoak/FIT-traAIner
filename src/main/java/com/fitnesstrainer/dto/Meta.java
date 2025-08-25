package com.fitnesstrainer.dto;

import java.util.List;

public class Meta {

    private String plan_name;
    private int goal_weight_gain_lbs;
    private int duration_days;
    private List<String> rest_days;
    private List<String> training_days;
    private String notes;

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public int getGoal_weight_gain_lbs() {
        return goal_weight_gain_lbs;
    }

    public void setGoal_weight_gain_lbs(int goal_weight_gain_lbs) {
        this.goal_weight_gain_lbs = goal_weight_gain_lbs;
    }

    public int getDuration_days() {
        return duration_days;
    }

    public void setDuration_days(int duration_days) {
        this.duration_days = duration_days;
    }

    public List<String> getRest_days() {
        return rest_days;
    }

    public void setRest_days(List<String> rest_days) {
        this.rest_days = rest_days;
    }

    public List<String> getTraining_days() {
        return training_days;
    }

    public void setTraining_days(List<String> training_days) {
        this.training_days = training_days;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
