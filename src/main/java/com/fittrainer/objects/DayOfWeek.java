package com.fittrainer.objects;

public enum DayOfWeek {
    MONDAY(1, "Mon"),
    TUESDAY(2, "Tue"),
    WEDNESDAY(3, "Wed"),
    THURSDAY(4, "Thu"),
    FRIDAY(5, "Fri"),
    SATURDAY(6, "Sat"),
    SUNDAY(7, "Sun");

    private final int index;
    private final String shortName;

    DayOfWeek(int index, String shortName) {
        this.index = index;
        this.shortName = shortName;
    }

    public int getIndex() {
        return index;
    }

    public String getShortName() {
        return shortName;
    }

    public static DayOfWeek fromIndex(int index) {
        for (DayOfWeek d : values()) {
            if (d.index == index) {
                return d;
            }
        }
        throw new IllegalArgumentException("Invalid index: " + index);
    }

    public static DayOfWeek fromString(String name) {
        for (DayOfWeek d : values()) {
            if (d.name().equalsIgnoreCase(name) || d.shortName.equalsIgnoreCase(name)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Invalid day name: " + name);
    }
}