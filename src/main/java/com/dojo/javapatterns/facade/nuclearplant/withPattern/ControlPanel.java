package com.dojo.javapatterns.facade.nuclearplant.withPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ControlPanel {

    private boolean active;
    private int numberOfOperators;

    public void testWaterFlow() {
        System.out.println("Testing water circulation into the core");;
    }

    public void testValves() {
        System.out.println("Testing system valves");
    }

    public void testEmergencySystem() {
        System.out.println("Testing the emergency system");
    }

    public void testReactivityRods() {
        System.out.println("Test reactivity rods");
    }

    public void testControlRods() {
        System.out.println("Test control rods");
    }

    public void measureReactivity() {
        System.out.println("Measure reactivity of the core");
    }

    public void measureRadiation() {
        System.out.println("Measure radiation");
    }

    public void measurePressure() {
        System.out.println("Read pressure sensors");
    }

    public void measureTemperature() {
        System.out.println("Read temperature sensors");
    }

    public void measureNoise() {
        System.out.println("Read noise sensors");
    }

    public void measureVibration() {
        System.out.println("Measure vibration sensors");
    }

    public void turnOnTurbines() {
        System.out.println("Turning on turbines");
    }

    public void turnOnPumps() {
        System.out.println("Turning on pumps");
    }

    public void turnOffTurbines() {
        System.out.println("Turning off turbines");
    }

    public void turnOffPumps() {
        System.out.println("Turning off pumps");
    }

    public void insertReactivityRods() {
        System.out.println("inserting reactivity rods");
    }

    public void removeControlRods() {
        System.out.println("Removing control rods");
    }

    public void removeReactivityRods() {
        System.out.println("Removing reactivity rods");
    }

    public void insertControlRods() {
        System.out.println("Inserting control rods");
    }

    public void startNeutronBombing() {
        System.out.println("Start bombing the core with neutrons");
    }

    public void stopNeutronBombing() {
        System.out.println("Stop bombing the core with neutrons");
    }
}
