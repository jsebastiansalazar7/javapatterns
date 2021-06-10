package com.dojo.javapatterns.builder.house.with_pattern;

import com.dojo.javapatterns.builder.house.enums.ArchitectureStyleEnum;
import com.dojo.javapatterns.builder.house.enums.ColorEnum;
import com.dojo.javapatterns.builder.house.enums.HouseStyleEnum;
import com.dojo.javapatterns.builder.house.enums.MaterialEnum;

import java.util.Arrays;
import java.util.List;

public class HouseMaker {

    public static void main(String... args) {
        System.out.println("*** Welcome to HouseMaker's inc ***\n");

        com.dojo.javapatterns.builder.house.with_pattern.House apartment = new House.Builder()
                .withArea(58.0f)
                .withNumberOfFloors(1)
                .withNumberOfBathrooms(1)
                .withNumberOfRooms(2)
                .withMaterial(MaterialEnum.BRICK)
                .withColor(ColorEnum.WHITE)
                .withHouseStyle(HouseStyleEnum.APARTMENT)
                .withArchitecture(ArchitectureStyleEnum.MODERN)
                .withSewerage(true)
                .withElectricity(true)
                .withInternet(true)
                .withBuildInSecurity(false)
                .withPrice(45000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_pattern.House house = new House.Builder()
                .withArea(125.0f)
                .withNumberOfFloors(2)
                .withNumberOfBathrooms(3)
                .withNumberOfRooms(5)
                .withMaterial(MaterialEnum.WOOD)
                .withColor(ColorEnum.BLUE)
                .withHouseStyle(HouseStyleEnum.HOMESTEAD)
                .withArchitecture(ArchitectureStyleEnum.CLASSIC)
                .withSewerage(true)
                .withElectricity(true)
                .withInternet(false)
                .withBuildInSecurity(true)
                .withPrice(115000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_pattern.House mansion = new House.Builder()
                .withArea(580.0f)
                .withNumberOfFloors(3)
                .withNumberOfBathrooms(13)
                .withNumberOfRooms(10)
                .withMaterial(MaterialEnum.CONCRETE)
                .withColor(ColorEnum.WHITE)
                .withHouseStyle(HouseStyleEnum.MANSION)
                .withArchitecture(ArchitectureStyleEnum.AVANT_GARDE)
                .withSewerage(true)
                .withElectricity(true)
                .withInternet(true)
                .withBuildInSecurity(true)
                .withPrice(2150000.0f)
                .build();
        com.dojo.javapatterns.builder.house.with_pattern.House farm = new House.Builder()
                .withArea(1250.0f)
                .withNumberOfFloors(1)
                .withNumberOfBathrooms(3)
                .withNumberOfRooms(4)
                .withMaterial(MaterialEnum.WOOD)
                .withColor(ColorEnum.YELLOW)
                .withHouseStyle(HouseStyleEnum.FARM)
                .withArchitecture(ArchitectureStyleEnum.SPANISH)
                .withSewerage(true)
                .withElectricity(true)
                .withInternet(false)
                .withBuildInSecurity(true)
                .withPrice(467000.0f)
                .build();

        List<com.dojo.javapatterns.builder.house.with_pattern.House> housesForSale = Arrays.asList(apartment, house, mansion, farm);
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
