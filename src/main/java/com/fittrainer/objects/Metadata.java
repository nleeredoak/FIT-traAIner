package com.fittrainer.objects;

import java.util.List;

/**
 * DTO representing metadata about the fitness plan.
 */
public class Metadata {

    private String plan_name;
    private int goalWeightGainLbs;
    private int durationDays;
    private List<String> restDays;
    private List<String> trainingDays;
    private String notes;

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
    }

    public int getGoalWeightGainLbs() {
        return goalWeightGainLbs;
    }

    public void setGoalWeightGainLbs(int goalWeightGainLbs) {
        this.goalWeightGainLbs = goalWeightGainLbs;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public List<String> getRestDays() {
        return restDays;
    }

    public void setRestDays(List<String> restDays) {
        this.restDays = restDays;
    }

    public List<String> getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(List<String> trainingDays) {
        this.trainingDays = trainingDays;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
