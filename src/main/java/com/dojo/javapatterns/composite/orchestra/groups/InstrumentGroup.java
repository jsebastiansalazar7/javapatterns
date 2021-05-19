package com.dojo.javapatterns.composite.orchestra.groups;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;

import java.util.List;

public interface InstrumentGroup {

    void fineTune();

    void play();

    void stop();

    void performSolo(Instrument instrument);

    void thankThePublic();

    List<Instrument> getAllInstruments();

    List<Instrument> getInstrumentsByName(InstrumentEnum instrument);

    void showCompositionOfGroup();

}
