package com.dojo.javapatterns.facade.airplane;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cockpit {

    public void turnOffAuxiliaryFuelPump() {
        System.out.println("Turning auxiliary fuel pump off.");
    }

    public void checkFlightControls() {
        System.out.println("Flight controls are free and correct.");
    }

    public void checkInstrumentsAndRadios() {
        System.out.println("Instruments and radios checked and set.");
    }

    public void checkLandingGearPositionLights() {
        System.out.println("Landing gear position lights checked.");
    }

    public void setAltimeter() {
        System.out.println("Altimeter set.");
    }

    public void setDirectionalGyro() {
        System.out.println("Directional gyro set.");
    }

    public void checkFuelGauges() {
        System.out.println("Fuel gauges checked.");
    }

    public void setTrim() {
        System.out.println("Trim set.");
    }

    public void testPropeller() {
        System.out.println("Propeller tested.");
    }

    public void checkMagnetos() {
        System.out.println("Magnetos checked.");
    }

    public void checkEngineIdle() {
        System.out.println("Engine idle tested.");
    }

    public void testFlaps() {
        System.out.println("Flaps tested.");
    }

    public void fastenSeatBeltsAndHarnesses() {
        System.out.println("Seat belts and harnesses fastened.");
    }

    public void turnOffParkingBrake() {
        System.out.println("Turned parking brake off.");
    }

    public void lockDoorsAndWindows() {
        System.out.println("Doors and windows locked.");
    }

    public void checkMixture() {
        System.out.println("Engine has full rich mixture.");
    }

    public void turnOnLights() {
        System.out.println("Turned landing, taxi and strobes on.");
    }

    public void turnOnCamera() {
        System.out.println("Turned transponder on.");
    }

    public void checkEngineInstruments() {
        System.out.println("Engine instruments checked.");
    }

}
