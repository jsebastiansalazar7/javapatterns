package com.dojo.javapatterns.decorator.smartpot.recipes;

import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import lombok.Builder;

@Builder
public class Stew implements SmartCook {

    @Override
    public void cook(CookingModeEnum cookingMode) {
        System.out.println("\nA stew is being cooked with " + cookingMode.name() + " mode!");
    }

}
