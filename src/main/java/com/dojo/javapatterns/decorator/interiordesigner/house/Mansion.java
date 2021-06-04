package com.dojo.javapatterns.decorator.interiordesigner.house;

import com.dojo.javapatterns.decorator.interiordesigner.room.*;
import lombok.Builder;
import lombok.Data;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@Builder
public class Mansion implements PropertyActions {

    private List<Bathroom> bathrooms;
    private List<Bedroom> bedrooms;
    private List<DinningRoom> dinningRooms;
    private List<LivingRoom> livingRooms;
    private List<Kitchen> kitchens;
    private Basement basement;
    private Attic attic;
    private Garage garage;
    private Yard yard;
    private Terrace terrace;
    private ClothesRoom clothesRoom;
    private LeisureRoom leisureRoom;

    @Override
    public double calculateTotalArea() {
        List<Double> bathroomsArea = bathrooms.stream().map(Room::getArea).collect(Collectors.toList());
        List<Double> bedroomsArea = bedrooms.stream().map(Room::getArea).collect(Collectors.toList());
        List<Double> dinningRoomsArea = dinningRooms.stream().map(Room::getArea).collect(Collectors.toList());
        List<Double> livingRoomsArea = livingRooms.stream().map(Room::getArea).collect(Collectors.toList());
        List<Double> kitchensArea = kitchens.stream().map(Room::getArea).collect(Collectors.toList());

        List<Double> areas = Stream.of(
                bathroomsArea,
                bedroomsArea,
                dinningRoomsArea,
                livingRoomsArea,
                kitchensArea,
                Collections.singletonList(basement.getArea()),
                Collections.singletonList(attic.getArea()),
                Collections.singletonList(garage.getArea()),
                Collections.singletonList(yard.getArea()),
                Collections.singletonList(terrace.getArea()),
                Collections.singletonList(clothesRoom.getArea()),
                Collections.singletonList(leisureRoom.getArea()))
                .flatMap(Collection::stream).collect(Collectors.toList());

        return areas.stream().reduce(0.0, (subTotal, roomArea) -> subTotal + roomArea);
    }

    @Override
    public void showPropertyComposition() {
        System.out.println("The mansion consists of " +
                bathrooms.size() + " bathroom, " +
                bedrooms.size() + " bedroom" +
                dinningRooms.size() + " dinning room, " +
                livingRooms.size() + " living room, " +
                kitchens.size() + "kitchen, " +
                "1 basement, 1 attic, 1 garage, 1 yard, " +
                "1 terrace, 1 clothes room, and 1 leisure room\n");;
    }

    @Override
    public void showPropertyStyle() {
        System.out.println("The style of the mansion goes as follows:");
        bathrooms.forEach(bathroom -> System.out.println(
                "Bathroom in " + bathroom.getDecorationStyle().name().toLowerCase() + " style"));
        bedrooms.forEach(bedroom -> System.out.println(
                "Bedroom in " + bedroom.getDecorationStyle().name().toLowerCase() +  " style"));
        dinningRooms.forEach(dinningRoom -> System.out.println(
                "Dinning Room in " + dinningRoom.getDecorationStyle().name().toLowerCase() +  " style"));
        livingRooms.forEach(livingRoom -> System.out.println(
                "Living Room in " + livingRoom.getDecorationStyle().name().toLowerCase() +  " style"));
        kitchens.forEach(kitchen -> System.out.println(
                "Kitchen in " + kitchen.getDecorationStyle().name().toLowerCase() +  " style"));
        System.out.println("Basement in " + basement.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Attic in " + attic.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Garage in " + garage.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Yard in " + yard.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Terrace in " + terrace.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Clothes Room in " + clothesRoom.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Leisure Room in " + leisureRoom.getDecorationStyle().name().toLowerCase() + " style\n");
    }
}
