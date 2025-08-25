package com.fittrainer.objects;

import java.util.List;
import java.util.Map;

/**
 * DTO representing a complete fitness plan, including metadata, templates for meals and workouts,
 * week overrides, and a calendar of days.
 */
public class FitnessPlan {

    private Metadata metadata;
    private Templates templates;
    private Map<String, Object> weekOverrides;
    private List<Day> calendar;

    public Metadata getMeta() {
        return metadata;
    }

    public void setMeta(Metadata metadata) {
        this.metadata = metadata;
    }

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    public Map<String, Object> getWeekOverrides() {
        return weekOverrides;
    }

    public void setWeekOverrides(Map<String, Object> weekOverrides) {
        this.weekOverrides = weekOverrides;
    }

    public List<Day> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Day> calendar) {
        this.calendar = calendar;
    }
}