package com.dojo.javapatterns.prototype.cars;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class LuxuryCar extends Car {

    public LuxuryCar(Car templateCar) {
        super(templateCar);
    }

    @Override
    public Car clone() {
        return new LuxuryCar(this);
    }

    @Override
    public void dailyDrive() {
        System.out.println("***** The car is quiet and comfortable *****");
    }

    @Override
    public void highwayRun() {
        System.out.println("***** The car is safe and stable at high speeds *****");
    }

    @Override
    public void wetConditionsDriveability() {
        System.out.println("***** The car utilizes all his technologies to remain in control *****");
    }
}
