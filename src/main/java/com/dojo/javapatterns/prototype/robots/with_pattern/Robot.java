package com.dojo.javapatterns.prototype.robots.with_pattern;

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

    protected Robot(Robot templateRobot) {
        if (templateRobot != null) {
            this.id = UUID.randomUUID();
            this.name = templateRobot.getName();
            this.robotType = templateRobot.getRobotType();
            this.battery = templateRobot.getBattery();
            this.height = templateRobot.getHeight();
            this.weight = templateRobot.getWeight();
            this.price = templateRobot.getPrice();
        }
    }

    public String getRobotNameWithId() {
        return name + " " + id.toString();
    }

    public void chargeBattery() {
        System.out.println("Charging batteries type " + this.getBattery().name() +
                " for robot " + this.getName() + " with id " + this.getId().toString());
    }

    public abstract Robot clone();

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
