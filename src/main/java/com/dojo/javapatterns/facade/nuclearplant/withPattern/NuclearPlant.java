package com.dojo.javapatterns.facade.nuclearplant.withPattern;

import com.dojo.javapatterns.facade.nuclearplant.withPattern.ControlPanel;

public class NuclearPlant {

    public static void main(String... args) {

        System.out.println("*** Running a Nuclear Reactor ***\n");

        ControlPanel controlPanel = ControlPanel.builder()
                .active(true)
                .numberOfOperators(48)
                .build();

        ReactorFacade reactorFacade = ReactorFacade.builder()
                .controlPanel(controlPanel)
                .build();

        reactorFacade.runReactor();
        reactorFacade.stopReactor();

    }
}
