package com.fittrainer.dto;

import java.util.List;

/**
 * DTO representing a meal with a name and a list of food items.
 */
public class Meal {

    private String name;
    private List<String> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}