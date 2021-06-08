package com.dojo.javapatterns.decorator.smartpot.recipes;

import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import lombok.Builder;

@Builder
public class Potatoes implements SmartCook {

    @Override
    public void cook(CookingModeEnum cookingMode) {
        System.out.println("\nPotatoes are being cooked with " + cookingMode + " mode!");
    }

}
