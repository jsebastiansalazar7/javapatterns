package com.dojo.javapatterns.prototype.robots.with_pattern.with_cloneable;

import com.dojo.javapatterns.prototype.robots.enums.BatteryEnum;
import com.dojo.javapatterns.prototype.robots.enums.RobotTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@SuperBuilder
@AllArgsConstructor
@Data
public abstract class Robot implements Cloneable {
    private UUID id;
    private String name;
    private RobotTypeEnum robotType;
    private BatteryEnum battery;
    private Float height;
    private Float weight;
    private Float price;
    private List<String> tags;
    private Processor processor;

    protected Robot(Robot templateRobot) {
        if (templateRobot != null) {
            this.id = UUID.randomUUID();
            this.name = templateRobot.getName();
            this.robotType = templateRobot.getRobotType();
            this.battery = templateRobot.getBattery();
            this.height = templateRobot.getHeight();
            this.weight = templateRobot.getWeight();
            this.price = templateRobot.getPrice();
            this.tags = templateRobot.getTags();
            Processor clonnedProcessor = Processor.builder()
                    .name(templateRobot.getProcessor().getName())
                    .version(templateRobot.getProcessor().getVersion())
                    .numberOfCores(templateRobot.getProcessor().getNumberOfCores())
                    .processorArchitecture(templateRobot.getProcessor().getProcessorArchitecture())
                    .frequency(templateRobot.getProcessor().getFrequency())
                    .build();
            this.processor = clonnedProcessor;
        }
    }

    // Shallow copy
    @Override
    public Robot clone() throws CloneNotSupportedException {
        return (Robot) super.clone();
    }

    protected abstract Robot deepCopy();

    protected String getRobotNameWithId() {
        return name + " " + id.toString();
    }

    protected void chargeBattery() {
        System.out.println("Charging batteries type " + this.getBattery().name() +
                " for robot " + this.getName() + " with id " + this.getId().toString());
    }

    protected abstract void move();

    protected abstract void processData();

    protected abstract void work();

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
                ", tags=" + tags +
                ", processor=" + processor +
                '}';
    }
}
