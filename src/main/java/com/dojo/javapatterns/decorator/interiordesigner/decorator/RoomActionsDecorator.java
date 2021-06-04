package com.dojo.javapatterns.decorator.interiordesigner.decorator;

import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import com.dojo.javapatterns.decorator.interiordesigner.room.RoomActions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
public abstract class RoomActionsDecorator implements RoomActions {

    protected RoomActions roomActions;

    @Override
    public void decorate(DecorationStyleEnum decorationStyle) {
        roomActions.decorate(decorationStyle);
    }
}
