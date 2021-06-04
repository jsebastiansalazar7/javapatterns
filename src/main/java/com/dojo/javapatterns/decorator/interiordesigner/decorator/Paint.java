package com.dojo.javapatterns.decorator.interiordesigner.decorator;

import com.dojo.javapatterns.decorator.interiordesigner.enums.PaintColorEnum;
import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Paint extends RoomActionsDecorator {

    private PaintColorEnum color;

    @Override
    public void decorate(DecorationStyleEnum decorationStyle) {
        super.decorate(decorationStyle);
        paintRoom();
    }

    public void paintRoom() {
        System.out.println("Painted room with " + color.name().toLowerCase() + " color");
    }
}
