package com.dojo.javapatterns.factory.food;

import java.util.Arrays;
import java.util.List;

public class JapaneseFood implements Food {
    @Override
    public void buyIngredients(String dish) {
        System.out.println("Buying ingredients for the Japanese dish: " + dish);
    }

    @Override
    public List<String> listDishes() {
        return Arrays.asList("Sushi California", "Ramen", "Takoyaki", "Miso soup", "Dorayaki");
    }

    @Override
    public void cook(String dish) {
        System.out.println("Preparing the Japanese dish: " + dish);
    }
}
