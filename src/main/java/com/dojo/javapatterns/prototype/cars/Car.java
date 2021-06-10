package com.dojo.javapatterns.prototype.cars;

import com.dojo.javapatterns.prototype.cars.enums.BodyStyleEnum;
import com.dojo.javapatterns.prototype.cars.enums.DriveSystemEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@SuperBuilder
@Data
public abstract class Car {

    private UUID id;
    private String vin;
    private String model;
    private BodyStyleEnum bodyStyleEnum;
    private DriveSystemEnum driveSystemEnum;
    private boolean automaticTransmission;
    private Float height;
    private Float length;
    private Float weight;
    private Float price;

    protected Car(Car templateCar) {
        if (templateCar != null) {
            this.id = UUID.randomUUID();
            this.vin = templateCar.getVin() + Math.round(Math.random()*100+1);
            this.model = templateCar.getModel();
            this.bodyStyleEnum = templateCar.getBodyStyleEnum();
            this.driveSystemEnum = templateCar.getDriveSystemEnum();
            this.automaticTransmission = templateCar.isAutomaticTransmission();
            this.height = templateCar.getHeight();
            this.length = templateCar.getLength();
            this.weight = templateCar.getWeight();
            this.price = templateCar.getPrice();
        }
    }

    public abstract Car clone();

    public abstract void dailyDrive();

    public abstract void highwayRun();

    public abstract void wetConditionsDriveability();

}
