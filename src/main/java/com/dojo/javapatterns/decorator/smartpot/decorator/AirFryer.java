package com.dojo.javapatterns.decorator.smartpot.decorator;

import com.dojo.javapatterns.decorator.smartpot.enums.CookingModeEnum;
import com.dojo.javapatterns.decorator.smartpot.recipes.SmartCook;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class AirFryer implements SmartCook {

    protected SmartCook smartCook;

    @Override
    public void cook(CookingModeEnum cookingMode) {
        smartCook.cook(cookingMode);
    }
}
