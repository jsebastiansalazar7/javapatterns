package com.dojo.javapatterns.builder.house.with_lombok;

import com.dojo.javapatterns.builder.house.enums.ArchitectureStyleEnum;
import com.dojo.javapatterns.builder.house.enums.ColorEnum;
import com.dojo.javapatterns.builder.house.enums.HouseStyleEnum;
import com.dojo.javapatterns.builder.house.enums.MaterialEnum;

import java.util.Arrays;
import java.util.List;

public class HouseMaker {
    public static void main(String... args) {
        System.out.println("*** Welcome to HouseMaker's inc ***\n");

        com.dojo.javapatterns.builder.house.with_lombok.House apartment = new House.HouseBuilder()
                .area(58.0f)
                .numberOfFloors(1)
                .numberOfBathrooms(1)
                .numberOfRooms(2)
                .material(MaterialEnum.BRICK)
                .color(ColorEnum.WHITE)
                .houseStyle(HouseStyleEnum.APARTMENT)
                .architecturaStyle(ArchitectureStyleEnum.MODERN)
                .hasSewerage(true)
                .hasElectricity(true)
                .hasInternet(true)
                .hasBuiltInSecurity(false)
                .price(45000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_lombok.House house = new House.HouseBuilder()
                .area(125.0f)
                .numberOfFloors(2)
                .numberOfBathrooms(3)
                .numberOfRooms(5)
                .material(MaterialEnum.WOOD)
                .color(ColorEnum.BLUE)
                .houseStyle(HouseStyleEnum.HOMESTEAD)
                .architecturaStyle(ArchitectureStyleEnum.CLASSIC)
                .hasSewerage(true)
                .hasElectricity(true)
                .hasInternet(false)
                .hasBuiltInSecurity(true)
                .price(115000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_lombok.House mansion = new House.HouseBuilder()
                .area(580.0f)
                .numberOfFloors(3)
                .numberOfBathrooms(13)
                .numberOfRooms(10)
                .material(MaterialEnum.CONCRETE)
                .color(ColorEnum.WHITE)
                .houseStyle(HouseStyleEnum.MANSION)
                .architecturaStyle(ArchitectureStyleEnum.AVANT_GARDE)
                .hasSewerage(true)
                .hasElectricity(true)
                .hasInternet(true)
                .hasBuiltInSecurity(true)
                .price(2150000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_lombok.House farm = new House.HouseBuilder()
                .area(1250.0f)
                .numberOfFloors(1)
                .numberOfBathrooms(3)
                .numberOfRooms(4)
                .material(MaterialEnum.WOOD)
                .color(ColorEnum.YELLOW)
                .houseStyle(HouseStyleEnum.FARM)
                .architecturaStyle(ArchitectureStyleEnum.SPANISH)
                .hasSewerage(true)
                .hasElectricity(true)
                .hasInternet(false)
                .hasBuiltInSecurity(true)
                .price(467000.0f)
                .build();

        List<com.dojo.javapatterns.builder.house.with_lombok.House> housesForSale = Arrays.asList(apartment, house, mansion, farm);
        System.out.println("The following houses are for sale this season\n");
        housesForSale.forEach(property -> System.out.println("- " + property.toString()));

        System.out.println("\nA customer has entered! He wants to buy the best house he can for his budget");

        float budget = (float) ((Math.random() * 2470000.0f) + 30000.0f);

        if (budget < 45000.0f) {
            System.out.println("Sorry... the customer can't bye any property with that budget of $" + budget);
        } else if (budget >= 45000.0f && budget < 115000.0f) {
            System.out.println("With this budget of $" + budget +
                    " the customer can buy the Apartment whose cost is $" + apartment.getPrice() +
                    " and still get back $" + (budget - apartment.getPrice()));
        } else if (budget >= 115000.0f && budget < 267000.0f) {
            System.out.println("With this budget of $" + budget +
                    " the customer can buy the Homestead whose cost is $" + house.getPrice() +
                    " and still get back $" + (budget - house.getPrice()));
        } else if (budget >= 267000.0f && budget < 2150000.0f) {
            System.out.println("With this budget of $" + budget +
                    " the customer can buy the Farm whose cost is $" + farm.getPrice() +
                    " and still get back $" + (budget - farm.getPrice()));
        } else {
            System.out.println("With this budget of $" + budget +
                    " the customer can buy the Mansion whose cost is $" + mansion.getPrice() +
                    " and still get back $" + (budget - mansion.getPrice()));
        }
    }
}
