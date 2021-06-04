package com.dojo.javapatterns.facade.nuclearplant.withoutPattern;

import com.dojo.javapatterns.facade.nuclearplant.withoutPattern.ControlPanel;

public class NuclearPlant {

    public static void main(String... args) {

        System.out.println("*** Running a Nuclear Reactor ***\n");
        ControlPanel controlPanel = ControlPanel.builder()
                .active(true)
                .numberOfOperators(48)
                .build();

        controlPanel.measurePressure();
        controlPanel.measureTemperature();
        controlPanel.measureVibration();
        controlPanel.measureNoise();
        controlPanel.measureReactivity();
        controlPanel.measureRadiation();

        controlPanel.testWaterFlow();
        controlPanel.testValves();
        controlPanel.testControlRods();
        controlPanel.testReactivityRods();
        controlPanel.testEmergencySystem();

        controlPanel.turnOnPumps();
        controlPanel.turnOnTurbines();
        controlPanel.insertReactivityRods();
        controlPanel.removeControlRods();
        controlPanel.startNeutronBombing();

        controlPanel.stopNeutronBombing();
        controlPanel.insertControlRods();
        controlPanel.removeReactivityRods();
        controlPanel.turnOffTurbines();
        controlPanel.turnOffPumps();

    }
}
