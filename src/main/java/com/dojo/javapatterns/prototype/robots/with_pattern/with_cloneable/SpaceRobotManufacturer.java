package com.dojo.javapatterns.prototype.robots.with_pattern.with_cloneable;

import com.dojo.javapatterns.prototype.robots.enums.BatteryEnum;
import com.dojo.javapatterns.prototype.robots.enums.RobotTypeEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class SpaceRobotManufacturer {

    public static void main(String... args) {
        System.out.println("*** Order received to produce some robots at Space Robot's inc. ***\n");

        System.out.println("1. Producing BB8 Robots using cloneable interface");
        List<Robot> bb8Robots = new ArrayList<>();

        Processor armProcessor = Processor.builder()
                .name("Apple A10")
                .version(1.0f)
                .numberOfCores(4)
                .processorArchitecture(Processor.ProcessorArchitectureEnum.ARM)
                .frequency(2.34f)
                .build();

        Robot bb8 = RobotBB8.builder()
                .id(UUID.randomUUID())
                .name("BB8")
                .robotType(RobotTypeEnum.MULTIPURPOSE)
                .battery(BatteryEnum.PP3)
                .height(40.0f)
                .weight(28.0f)
                .price(12000.0f)
                .tags(Arrays.asList("Small", "Practical", "Loyal", "Fast"))
                .processor(armProcessor)
                .build();
        bb8Robots.add(bb8);

        // The shallow copy will have the same id
        Robot bb8SecondShallowClone;
        try {
            bb8SecondShallowClone = bb8.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("An error occurred trying to create a shallow clone from " + bb8.toString());
            bb8SecondShallowClone = bb8.deepCopy();
        }
        bb8Robots.add(bb8SecondShallowClone);

        Robot bb8ThirdDeepClone = bb8.deepCopy();
        bb8Robots.add(bb8ThirdDeepClone);

        System.out.println("Units Produced: ");
        bb8Robots.forEach(robot -> System.out.println("* " + robot.getId()));

        System.out.println("\n2. Producing C3PO Robots with the deep copy method in a loop");
        List<Robot> c3poRobots = new ArrayList<>();
        Robot c3po = RobotC3PO.builder()
                .id(UUID.randomUUID())
                .name("C-3PO")
                .robotType(RobotTypeEnum.ASSISTANT)
                .battery(BatteryEnum.LITIUM)
                .height(175.0f)
                .weight(118.0f)
                .price(39000.0f)
                .tags(Arrays.asList("Small", "Practical", "Loyal", "Fast"))
                .processor(armProcessor)
                .build();
        for (int i = 0; i < 5; i++) {
            c3poRobots.add(c3po.deepCopy());
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
                .tags(Arrays.asList("Small", "Practical", "Loyal", "Fast"))
                .processor(armProcessor)
                .build();
        r2d2Robots.add(r2d2);
        for (int i = 0; i < 5; i++) {
            try {
                r2d2Robots.add(r2d2.clone());
            } catch (CloneNotSupportedException e) {
                System.out.println("An error occurred trying to create a shallow clone from " + r2d2.toString());
                r2d2Robots.add(r2d2.deepCopy());
            }
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
