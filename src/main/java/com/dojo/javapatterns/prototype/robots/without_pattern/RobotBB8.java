package com.dojo.javapatterns.prototype.robots.without_pattern;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class RobotBB8 extends Robot {

    @Override
    public void move() {
        System.out.println("- " + this.getRobotNameWithId() + " rolls to move");
    }

    @Override
    public void processData() {
        System.out.println("- " + this.getRobotNameWithId() + " is processing data while rolling around, needs an interpreter");
    }

    @Override
    public void work() {
        System.out.println("- " + this.getRobotNameWithId() + " should be working, but we prefers to roll around instead...");
    }
}
