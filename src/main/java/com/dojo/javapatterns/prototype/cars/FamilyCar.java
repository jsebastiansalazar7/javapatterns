package com.dojo.javapatterns.prototype.cars;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class FamilyCar extends Car {

    public FamilyCar(Car templateCar) {
        super(templateCar);
    }

    @Override
    public Car clone() {
        return new FamilyCar(this);
    }

    @Override
    public void dailyDrive() {
        System.out.println("***** The car gives good fuel economy *****");
    }

    @Override
    public void highwayRun() {
        System.out.println("***** The car is stable at medium to low speeds *****");
    }

    @Override
    public void wetConditionsDriveability() {
        System.out.println("***** The car drives safe and slow, but with no difficulties *****");
    }



}
