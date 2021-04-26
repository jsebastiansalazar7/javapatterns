package com.dojo.javapatterns.factory.food;

import java.util.List;

public interface Food {

    void buyIngredients(String dish);
    List<String> listDishes();
    void cook(String dish);
}
