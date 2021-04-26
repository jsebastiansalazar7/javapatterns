package com.dojo.javapatterns.factory.food.with_pattern.enums;

public enum FoodTypeEnum {
    ITALIAN("Italian"),
    JAPANESE("Japanese"),
    MEXICAN("Mexican"),
    PERUVIAN("Peruvian");

    private String foodType;

    FoodTypeEnum(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
}
