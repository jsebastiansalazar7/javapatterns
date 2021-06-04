package com.dojo.javapatterns.decorator.interiordesigner.room;

import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class DinningRoom extends Room {

    @Override
    public void decorate(DecorationStyleEnum decorationStyle) {
        this.decorationStyle = decorationStyle;
        System.out.println("Decorate the dinning room with " + decorationStyle.name().toLowerCase() + " style");
    }
}
