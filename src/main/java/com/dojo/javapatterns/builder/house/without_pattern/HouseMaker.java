package com.dojo.javapatterns.builder.house.without_pattern;

import com.dojo.javapatterns.builder.house.enums.ArchitectureStyleEnum;
import com.dojo.javapatterns.builder.house.enums.ColorEnum;
import com.dojo.javapatterns.builder.house.enums.HouseStyleEnum;
import com.dojo.javapatterns.builder.house.enums.MaterialEnum;

import java.util.Arrays;
import java.util.List;

public class HouseMaker {

    public static void main(String... args) {

        System.out.println("*** Welcome to HouseMaker's inc ***\n");
        House apartment = new House(58.0f, 1, 1, 2, MaterialEnum.BRICK,
                ColorEnum.WHITE, HouseStyleEnum.APARTMENT, ArchitectureStyleEnum.MODERN,
                true, true, true, false, 45000.0f);

        House house = new House(125.0f, 2, 3, 5, MaterialEnum.WOOD,
                ColorEnum.BLUE, HouseStyleEnum.HOMESTEAD, ArchitectureStyleEnum.CLASSIC,
                true, true, false, true, 115000.0f);

        House mansion = new House(580.0f, 3, 13, 10, MaterialEnum.CONCRETE,
                ColorEnum.WHITE, HouseStyleEnum.MANSION, ArchitectureStyleEnum.AVANT_GARDE,
                true, true, true, true, 2150000.0f);

        House farm = new House(1250.0f, 1, 3, 4, MaterialEnum.WOOD,
                ColorEnum.YELLOW, HouseStyleEnum.FARM, ArchitectureStyleEnum.SPANISH,
                true, true, false, true, 467000.0f);

        List<House> housesForSale = Arrays.asList(apartment, house, mansion, farm);
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
