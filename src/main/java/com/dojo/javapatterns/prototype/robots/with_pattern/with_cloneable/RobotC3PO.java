package com.dojo.javapatterns.prototype.robots.with_pattern.with_cloneable;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class RobotC3PO extends Robot {

    public RobotC3PO(Robot templateRobot) {
        super(templateRobot);
    }

    @Override
    protected Robot deepCopy() {
        return new RobotC3PO(this);
    }

    @Override
    public void move() {
        System.out.println("- " + this.getRobotNameWithId() + " walks to move");
    }

    @Override
    public void processData() {
        System.out.println("- " + this.getRobotNameWithId() + " is processing data at a very fast pace with his last " +
                "generation processor and exposing it in a human language");
    }

    @Override
    public void work() {
        System.out.println("- " + this.getRobotNameWithId() + " is working in human-like tasks");
    }
}
