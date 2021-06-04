package com.dojo.javapatterns.decorator.interiordesigner;

import com.dojo.javapatterns.decorator.interiordesigner.decorator.Paint;
import com.dojo.javapatterns.decorator.interiordesigner.decorator.RoomActionsDecorator;
import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import com.dojo.javapatterns.decorator.interiordesigner.enums.PaintColorEnum;
import com.dojo.javapatterns.decorator.interiordesigner.house.Apartment;
import com.dojo.javapatterns.decorator.interiordesigner.room.*;

import java.util.Collections;

public class RealEstateCompany {

    public static void main(String... args) {

        System.out.println("*** Preparing the rooms fron an apartment ***");
        Room bedroom = Bedroom.builder()
                .area(22.0)
                .decorationStyle(DecorationStyleEnum.NONE)
                .build();
        System.out.println("* Decorating room");
        bedroom.decorate(DecorationStyleEnum.COLONIAL);
        System.out.println("* Decorating and painting room");
        RoomActionsDecorator bedroomPaint = preparePaintForRoom(bedroom, PaintColorEnum.WHITE);
        bedroomPaint.decorate(DecorationStyleEnum.ASIAN);
        showRoomDetails(bedroom);

        Room kitchen = Kitchen.builder()
                .area(16.0)
                .decorationStyle(DecorationStyleEnum.NONE)
                .build();
        RoomActionsDecorator kitchenPaint = preparePaintForRoom(kitchen, PaintColorEnum.GREEN);
        kitchenPaint.decorate(DecorationStyleEnum.MODERN);
        showRoomDetails(kitchen);

        Room bathroom = Bathroom.builder()
                .area(6.0)
                .decorationStyle(DecorationStyleEnum.NONE)
                .build();
        RoomActionsDecorator bathroomPaint = preparePaintForRoom(bathroom, PaintColorEnum.CYAN);
        bathroomPaint.decorate(DecorationStyleEnum.CLASSIC);
        showRoomDetails(bathroom);

        Room livingRoom = LivingRoom.builder()
                .area(14.0)
                .decorationStyle(DecorationStyleEnum.NONE)
                .build();
        RoomActionsDecorator livingRoomPaint = preparePaintForRoom(livingRoom, PaintColorEnum.PINK);
        livingRoomPaint.decorate(DecorationStyleEnum.MINIMALIST);
        showRoomDetails(livingRoom);

        Room dinningRoom = DinningRoom.builder()
                .area(10.0)
                .decorationStyle(DecorationStyleEnum.NONE)
                .build();
        RoomActionsDecorator dinningRoomPaint = preparePaintForRoom(dinningRoom, PaintColorEnum.WHITE);
        dinningRoomPaint.decorate(DecorationStyleEnum.MEDITERRANEAN);
        showRoomDetails(dinningRoom);

        System.out.println("*** Apartment information ***");
        Apartment apartment = Apartment.builder()
                .bathrooms(Collections.singletonList((Bathroom) bathroom))
                .bedrooms(Collections.singletonList((Bedroom) bedroom))
                .dinningRoom((DinningRoom) dinningRoom)
                .livingRoom((LivingRoom) livingRoom)
                .kitchen((Kitchen) kitchen)
                .build();
        System.out.println("The total area of the apartment is " + apartment.calculateTotalArea() + "m2\n");
        apartment.showPropertyComposition();
        apartment.showPropertyStyle();

    }

    private static void showRoomDetails(Room room) {
        System.out.println("The room size is " + room.getArea() + " m2 and it has " + room.getDecorationStyle().name().toLowerCase() + " style\n");
    }

    private static RoomActionsDecorator preparePaintForRoom(Room room, PaintColorEnum color) {
        return Paint.builder()
                .roomActions(room)
                .color(color)
                .build();
    }
}
