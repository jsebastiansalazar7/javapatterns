package com.dojo.javapatterns.decorator.interiordesigner.room;

import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Bedroom extends Room {

    @Override
    public void decorate(DecorationStyleEnum decorationStyle) {
        super.decorationStyle = decorationStyle;
        System.out.println("Decorate the bedroom with " + decorationStyle.name().toLowerCase() + " style");
    }
}
