package com.dojo.javapatterns.factory.food;

import java.util.Arrays;
import java.util.List;

public class ItalianFood implements Food {
    @Override
    public void buyIngredients(String dish) {
        System.out.println("Buying ingredients for the Italian dish: " + dish);
    }

    @Override
    public List<String> listDishes() {
        return Arrays.asList("Margarita Pizza", "Napolitan Spagetti", "Cheese Raviolis", "Tortelinis", "Canelones");
    }

    @Override
    public void cook(String dish) {
        System.out.println("Preparing the Italian dish: " + dish);
    }
}
