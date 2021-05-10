package com.dojo.javapatterns.prototype.cars;

import com.dojo.javapatterns.prototype.cars.enums.BodyStyleEnum;
import com.dojo.javapatterns.prototype.cars.enums.DriveSystemEnum;
import com.dojo.javapatterns.prototype.robots.with_pattern.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CarManufacturer {

    public static void main(String[] args) {
        System.out.println("***** Manufacturer starts producing cars *****");

        System.out.println("\n===== First production line: Mass production cars =====");
        List<Car> standardCars = new ArrayList<>();

        System.out.println("\n5 standard cars are being finished!");
        Car familyCar = FamilyCar.builder()
                .id(UUID.randomUUID())
                .vin("VMQ23983D")
                .model("Serrano")
                .bodyStyleEnum(BodyStyleEnum.HATCHBACK)
                .driveSystemEnum(DriveSystemEnum.FWD)
                .automaticTransmission(false)
                .height(1540.0F)
                .length(3252.5F)
                .weight(1643.9F)
                .price(19570F)
                .build();
        standardCars.add(familyCar);
        Car automaticFamilyCar = familyCar.clone();
        automaticFamilyCar.setAutomaticTransmission(true);
        standardCars.add(automaticFamilyCar);
        for (int i = 0; i<3; i++) { standardCars.add(familyCar.clone()); }

        standardCars.forEach(car -> System.out.println("ID: " + car.getId() + " VIN: " + car.getVin() + " Model: " + car.getModel() + " Height: " + car.getHeight() + " mm. Length: " + car.getLength() + " mm."));
        driveTest(standardCars);

        System.out.println("\n===== Second production line: Luxury cars =====");
        List<Car> luxuryCars = new ArrayList<>();

        System.out.println("\n3 luxury cars are being finished!");
        Car luxuryCar = LuxuryCar.builder()
                .id(UUID.randomUUID())
                .vin("LXS51862Z")
                .model("Emperor")
                .bodyStyleEnum(BodyStyleEnum.SEDAN)
                .driveSystemEnum(DriveSystemEnum.AWD)
                .automaticTransmission(true)
                .height(1420F)
                .length(3331F)
                .weight(1893F)
                .price(42990F)
                .build();
        luxuryCars.add(luxuryCar);
        luxuryCars.add(luxuryCar.clone());
        luxuryCars.add(luxuryCar.clone());

        luxuryCars.forEach(car -> System.out.println("ID: " + car.getId() + " VIN: " + car.getVin() + " Model: " + car.getModel() + " Height: " + car.getHeight() + " mm. Length: " + car.getLength() + " mm."));
        driveTest(luxuryCars);

        System.out.println("\n===== Last production line: Sports cars =====");
        List<Car> sportsCars = new ArrayList<>();

        System.out.println("\n2 sports cars are being finished!");
        Car sportsCar = SportsCar.builder()
                .id(UUID.randomUUID())
                .vin("XTR92630T")
                .model("Zion")
                .bodyStyleEnum(BodyStyleEnum.COUPE)
                .driveSystemEnum(DriveSystemEnum.RWD)
                .automaticTransmission(false)
                .height(1350.4F)
                .length(2939F)
                .weight(1223.2F)
                .price(28790F)
                .build();
        sportsCars.add(sportsCar);
        sportsCars.add(sportsCar.clone());

        sportsCars.forEach(car -> System.out.println("ID: " + car.getId() + " VIN: " + car.getVin() + " Model: " + car.getModel() + " Height: " + car.getHeight() + " mm. Length: " + car.getLength() + " mm."));
        driveTest(sportsCars);


    }

    private static void driveTest(List<Car> cars) {
        cars.forEach(car -> {
            System.out.println("\nDrive testing " + car.getModel() + " | " + car.getBodyStyleEnum() + " | " + (car.isAutomaticTransmission() ? "AT" : "MT"));
            System.out.println("Daily drive results: ");
            car.dailyDrive();
            System.out.println("Highway run results:");
            car.highwayRun();
            System.out.println("Wet conditions results:");
            car.wetConditionsDriveability();
        });
    }
}
