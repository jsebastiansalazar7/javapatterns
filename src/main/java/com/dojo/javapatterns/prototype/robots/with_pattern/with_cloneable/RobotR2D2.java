package com.dojo.javapatterns.prototype.robots.with_pattern.with_cloneable;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class RobotR2D2 extends Robot {

    public RobotR2D2(Robot templateRobot) {
        super(templateRobot);
    }

    @Override
    protected Robot deepCopy() {
        return new RobotR2D2(this);
    }

    @Override
    public void move() {
        System.out.println("- " + this.getRobotNameWithId() + " slides to move");
    }

    @Override
    public void processData() {
        System.out.println("- " + this.getRobotNameWithId() + " is processing data while making funny noises.  " +
                "An interpreter is needed");
    }

    @Override
    public void work() {
        System.out.println("- " + this.getRobotNameWithId() + " in a secret mission with a Padawan");
    }
}
