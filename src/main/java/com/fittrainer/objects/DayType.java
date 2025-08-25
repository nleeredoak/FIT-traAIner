package com.fittrainer.objects;

public enum DayType {
    TRAINING,
    REST;

    public static DayType fromString(String value) {
        for (DayType type : DayType.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid DayType: " + value);
    }
}