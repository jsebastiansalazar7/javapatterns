package com.dojo.javapatterns.factory.food;

import java.util.Arrays;
import java.util.List;

public class MexicanFood implements Food {
    @Override
    public void buyIngredients(String dish) {
        System.out.println("Buying ingredients for the Mexican dish: " + dish);
    }

    @Override
    public List<String> listDishes() {
        return Arrays.asList("Tacos al pastor", "Burritos", "Nachos with cheese", "Mole");
    }

    @Override
    public void cook(String dish) {
        System.out.println("Preparing the Mexican dish: " + dish);
    }
}
