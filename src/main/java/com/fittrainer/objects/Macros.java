package com.fittrainer.objects;

/**
 * DTO representing macronutrient breakdown in grams.
 */
public class Macros {

    private int proteinGrams;
    private int carbGrams;
    private int fatGrams;

    public int getProteinGrams() {
        return proteinGrams;
    }

    public void setProteinGrams(int proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    public int getCarbGrams() {
        return carbGrams;
    }

    public void setCarbGrams(int carbGrams) {
        this.carbGrams = carbGrams;
    }

    public int getFatGrams() {
        return fatGrams;
    }

    public void setFatGrams(int fatGrams) {
        this.fatGrams = fatGrams;
    }
}