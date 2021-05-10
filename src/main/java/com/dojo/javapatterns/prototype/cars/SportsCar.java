package com.dojo.javapatterns.prototype.cars;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class SportsCar extends Car {

    public SportsCar(Car templateCar) {
        super(templateCar);
    }

    @Override
    public Car clone() {
        return new SportsCar(this);
    }

    @Override
    public void dailyDrive() {
        System.out.println("***** The car has stiff suspension and poor fuel economy *****");
    }

    @Override
    public void highwayRun() {
        System.out.println("***** The car runs fast and safe *****");
    }

    @Override
    public void wetConditionsDriveability() {
        System.out.println("***** The car spins a lot *****");
    }
}
