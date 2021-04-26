package com.dojo.javapatterns.factory.food;

import java.util.Arrays;
import java.util.List;

public class PeruvianFood implements Food {
    @Override
    public void buyIngredients(String dish) {
        System.out.println("Buying ingredients for the Peruvian dish: " + dish);
    }

    @Override
    public List<String> listDishes() {
        return Arrays.asList("Ceviche", "Lomo saltado", "Causa Peruana", "Piqueo", "Copa Limeña");
    }

    @Override
    public void cook(String dish) {
        System.out.println("Preparing the Peruvian dish: " + dish);
    }
}
