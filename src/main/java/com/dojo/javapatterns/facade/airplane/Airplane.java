package com.dojo.javapatterns.facade.airplane;

public class Airplane {

    public static void main(String[] args) {
        System.out.println("*** Doing pre-flight checks on an airplane ***");
        Cockpit cockpit = Cockpit.builder()
                .build();
        AirplaneFacade airplaneFacade = AirplaneFacade.builder()
                .cockpit(cockpit)
                .build();
        airplaneFacade.beforeTakeoffChecklist();
        airplaneFacade.finalChecks();
        System.out.println("We're good to go captain!");
    }
}
