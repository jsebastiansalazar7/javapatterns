package com.dojo.javapatterns.facade.airplane;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AirplaneFacade {

    private Cockpit cockpit;

    public void beforeTakeoffChecklist() {
        System.out.println("\nDoing Before-Takeoff checklist...");
        cockpit.turnOffAuxiliaryFuelPump();
        cockpit.checkFlightControls();
        cockpit.checkInstrumentsAndRadios();
        cockpit.checkLandingGearPositionLights();
        cockpit.setAltimeter();
        cockpit.setDirectionalGyro();
        cockpit.checkFuelGauges();
        cockpit.setTrim();
        cockpit.testPropeller();
        cockpit.checkMagnetos();
        cockpit.checkEngineIdle();
        cockpit.testFlaps();
        cockpit.fastenSeatBeltsAndHarnesses();
        cockpit.turnOffParkingBrake();
    }

    public void finalChecks() {
        System.out.println("\nDoing final items check...");
        cockpit.lockDoorsAndWindows();
        cockpit.checkMixture();
        cockpit.turnOnLights();
        cockpit.turnOnCamera();
        cockpit.checkEngineInstruments();
    }
}
