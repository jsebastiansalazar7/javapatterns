package com.dojo.javapatterns.facade.nuclearplant.withPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReactorFacade {

    private ControlPanel controlPanel;

    public void runReactor() {
        measureSensors();
        testReactor();
        System.out.println("\n* Running the reactor");
        controlPanel.turnOnPumps();
        controlPanel.turnOnTurbines();
        controlPanel.insertReactivityRods();
        controlPanel.removeControlRods();
        controlPanel.startNeutronBombing();
    }

    public void stopReactor() {
        System.out.println("\n* Stopping the reactor");
        controlPanel.stopNeutronBombing();
        controlPanel.insertControlRods();
        controlPanel.removeReactivityRods();
        controlPanel.turnOffTurbines();
        controlPanel.turnOffPumps();
    }

    private void measureSensors() {
        System.out.println("\n* Measuring sensors of the reactor");
        controlPanel.measurePressure();
        controlPanel.measureTemperature();
        controlPanel.measureVibration();
        controlPanel.measureNoise();
        controlPanel.measureReactivity();
        controlPanel.measureRadiation();
    }

    private void testReactor() {
        System.out.println("\n* Testing the reactor");
        controlPanel.testWaterFlow();
        controlPanel.testValves();
        controlPanel.testControlRods();
        controlPanel.testReactivityRods();
        controlPanel.testEmergencySystem();
    }
}
