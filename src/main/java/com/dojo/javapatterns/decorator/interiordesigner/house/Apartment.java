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
public class Apartment implements PropertyActions {

    private List<Bathroom> bathrooms;
    private List<Bedroom> bedrooms;
    private DinningRoom dinningRoom;
    private LivingRoom livingRoom;
    private Kitchen kitchen;

    @Override
    public double calculateTotalArea() {
        List<Double> bathroomsArea = bathrooms.stream().map(Room::getArea).collect(Collectors.toList());
        List<Double> bedroomsArea = bedrooms.stream().map(Room::getArea).collect(Collectors.toList());

        List<Double> areas = Stream.of(
                bathroomsArea,
                bedroomsArea,
                Collections.singletonList(dinningRoom.getArea()),
                Collections.singletonList(livingRoom.getArea()),
                Collections.singletonList(kitchen.getArea()))
                .flatMap(Collection::stream).collect(Collectors.toList());

        return areas.stream().reduce(0.0, (subTotal, roomArea) -> subTotal + roomArea);
    }

    @Override
    public void showPropertyComposition() {
        System.out.println("The apartment consists of " +
                bathrooms.size() + " bathroom, " +
                bedrooms.size() + " bedroom" +
                "1 dinning room, 1 livingRoom, and 1 kitchen\n");;
    }

    @Override
    public void showPropertyStyle() {
        System.out.println("The style of the apartment goes as follows:");
        bathrooms.forEach(bathroom -> System.out.println(
                "Bathroom in " + bathroom.getDecorationStyle().name().toLowerCase() + " style"));
        bedrooms.forEach(bedroom -> System.out.println(
                "Bedroom in " + bedroom.getDecorationStyle().name().toLowerCase() +  " style"));
        System.out.println("Dinning room in " + dinningRoom.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Living room in " + livingRoom.getDecorationStyle().name().toLowerCase() + " style");
        System.out.println("Kitchen in " + kitchen.getDecorationStyle().name().toLowerCase() + " style\n");
    }
}
