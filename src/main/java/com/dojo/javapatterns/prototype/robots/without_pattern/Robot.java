package com.dojo.javapatterns.prototype.robots.without_pattern;

import com.dojo.javapatterns.prototype.robots.enums.BatteryEnum;
import com.dojo.javapatterns.prototype.robots.enums.RobotTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;


import java.util.UUID;

@SuperBuilder
@AllArgsConstructor
@Data
public abstract class Robot {
    private UUID id;
    private String name;
    private RobotTypeEnum robotType;
    private BatteryEnum battery;
    private Float height;
    private Float weight;
    private Float price;

    public String getRobotNameWithId() {
        return name + " " + id.toString();
    }

    public void chargeBattery() {
        System.out.println("Charging batteries type " + this.getBattery().name() +
                " for robot " + this.getName() + " with id " + this.getId().toString());
    }

    public abstract void move();

    public abstract void processData();

    public abstract void work();

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", robotType=" + robotType +
                ", battery=" + battery +
                ", height=" + height +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
