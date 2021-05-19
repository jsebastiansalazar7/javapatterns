package com.dojo.javapatterns.composite.orchestra.utils;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;

import java.util.List;
import java.util.stream.Collectors;

public class InstrumentGroupUtilities {

    public static List<Instrument> getInstrumentsByName(List<Instrument> instruments, InstrumentEnum instrumentName) {
        return instruments.stream()
                .filter(instrument -> instrumentName.equals(instrument.getInstrument()))
                .collect(Collectors.toList());
    }
}
