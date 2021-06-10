package com.dojo.javapatterns.decorator.smartpot.recipes;

import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import lombok.Builder;

@Builder
public class Pasta implements SmartCook {

    @Override
    public void cook(CookingModeEnum cookingMode) {
        System.out.println("\nPasta is being cooked with " + cookingMode + " mode!");
    }
}
