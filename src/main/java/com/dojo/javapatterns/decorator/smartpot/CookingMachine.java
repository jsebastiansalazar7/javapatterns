package com.dojo.javapatterns.decorator.smartpot;

import com.dojo.javapatterns.decorator.smartpot.decorator.AirFryer;
import com.dojo.javapatterns.decorator.smartpot.decorator.Fries;
import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import com.dojo.javapatterns.decorator.smartpot.recipes.*;

public class CookingMachine {

    public static void main(String[] args) {
        System.out.println("*** Let's use our SmartPot to cook delicious recipes ***");

        SmartCook riceSmartCook = Rice.builder().build();
        riceSmartCook.cook(CookingModeEnum.STEAM);

        SmartCook pastaSmartCook = Pasta.builder().build();
        pastaSmartCook.cook(CookingModeEnum.SLOW_COOK);

        SmartCook stewSmartCook = Stew.builder().build();
        stewSmartCook.cook(CookingModeEnum.PRESSURE);

        SmartCook potatoesSmartCook = Potatoes.builder().build();
        potatoesSmartCook.cook(CookingModeEnum.STEAM);

        System.out.println("\n*** Can we cook some french fries with those potatoes? Let's assemble the air fryer accessory! ***");
        SmartCook fries = assembleAirFryer(potatoesSmartCook);
        fries.cook(CookingModeEnum.STEAM);
    }

    private static AirFryer assembleAirFryer(SmartCook smartCook) {
        return Fries.builder()
                .smartCook(smartCook)
                .build();
    }
}
