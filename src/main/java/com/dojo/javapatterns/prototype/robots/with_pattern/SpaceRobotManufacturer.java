package com.dojo.javapatterns.prototype.robots.with_pattern;

import com.dojo.javapatterns.prototype.robots.enums.BatteryEnum;
import com.dojo.javapatterns.prototype.robots.enums.RobotTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SpaceRobotManufacturer {

    public static void main(String... args) {
        System.out.println("*** Order received to produce some robots at Space Robot's inc. ***\n");

        System.out.println("1. Producing BB8 Robots using the clone pattern using an abstract method and a self-instance constructor");
        List<Robot> bb8Robots = new ArrayList<>();

        Robot bb8 = RobotBB8.builder()
                .id(UUID.randomUUID())
                .name("BB8")
                .robotType(RobotTypeEnum.MULTIPURPOSE)
                .battery(BatteryEnum.PP3)
                .height(40.0f)
                .weight(28.0f)
                .price(12000.0f)
                .build();
        bb8Robots.add(bb8);

        Robot bb8Second = bb8.clone();
        bb8Robots.add(bb8Second);
        Robot bb8Third = bb8.clone();
        bb8Robots.add(bb8Third);

        System.out.println("Units Produced: ");
        bb8Robots.forEach(robot -> System.out.println("* " + robot.getId()));

        System.out.println("\n2. Producing C3PO Robots with clone method in a loop");
        List<Robot> c3poRobots = new ArrayList<>();
        Robot c3po = RobotC3PO.builder()
                .id(UUID.randomUUID())
                .name("C-3PO")
                .robotType(RobotTypeEnum.ASSISTANT)
                .battery(BatteryEnum.LITIUM)
                .height(175.0f)
                .weight(118.0f)
                .price(39000.0f)
                .build();
        for (int i = 0; i < 5; i++) {
            c3poRobots.add(c3po.clone());
        }
        System.out.println("Units Produced: ");
        c3poRobots.forEach(robot -> System.out.println("* " + robot.getId()));

        System.out.println("\n3. Producing R2D2 Robots with clone method in a loop again");
        List<Robot> r2d2Robots = new ArrayList<>();
        Robot r2d2 = RobotR2D2.builder()
                .id(UUID.randomUUID())
                .name("R2D2")
                .robotType(RobotTypeEnum.MULTIPURPOSE)
                .battery(BatteryEnum.D)
                .height(55.0f)
                .weight(35.0f)
                .price(17000.0f)
                .build();
        r2d2Robots.add(r2d2);
        for (int i = 0; i < 5; i++) {
            r2d2Robots.add(r2d2.clone());
        }
        System.out.println("Units Produced: ");
        r2d2Robots.forEach(robot -> System.out.println("* " + robot.getId()));

        System.out.println("*** Testing Stage Beginning ***\n");
        testRobots(bb8Robots);
        testRobots(c3poRobots);
        testRobots(r2d2Robots);
    }

    private static void testRobots(List<Robot> robots) {
        System.out.println("Testing of robots " + robots.get(0).getName());
        robots.forEach(robot -> {
            System.out.println("\n*" + robot.getRobotNameWithId());
            robot.chargeBattery();
            robot.move();
            robot.processData();
            robot.work();
        });
    }

}
