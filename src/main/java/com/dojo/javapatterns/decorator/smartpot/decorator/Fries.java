package com.dojo.javapatterns.decorator.smartpot.decorator;

import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Fries extends AirFryer {

    @Override
    public void cook(CookingModeEnum cookingMode) {
        super.cook(cookingMode);
        makeFries();
    }

    private void makeFries() {
        System.out.println("\n***** Potatoes are being air fried! *****");
    }
}
