package com.fitnesstrainer.dto;

import java.util.List;
import java.util.Map;

public class FitnessPlan {

    private Meta meta;
    private Templates templates;
    private Map<String, Object> week_overrides; // could create another class if you want
    private List<Day> calendar;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    public Map<String, Object> getWeek_overrides() {
        return week_overrides;
    }

    public void setWeek_overrides(Map<String, Object> week_overrides) {
        this.week_overrides = week_overrides;
    }

    public List<Day> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Day> calendar) {
        this.calendar = calendar;
    }
}