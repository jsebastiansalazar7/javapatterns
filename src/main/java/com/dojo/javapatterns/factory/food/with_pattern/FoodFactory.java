package com.dojo.javapatterns.factory.food.with_pattern;

import com.dojo.javapatterns.factory.food.*;
import com.dojo.javapatterns.factory.food.with_pattern.enums.FoodTypeEnum;

import static com.dojo.javapatterns.factory.food.with_pattern.enums.FoodTypeEnum.*;

public class FoodFactory {

    public static Food getFood(FoodTypeEnum foodType) {
        switch(foodType) {
            case ITALIAN:
                return new ItalianFood();
            case JAPANESE:
                return new JapaneseFood();
            case MEXICAN:
                return new MexicanFood();
            case PERUVIAN:
                return new PeruvianFood();
            default:
                return null;
        }
    }
}
