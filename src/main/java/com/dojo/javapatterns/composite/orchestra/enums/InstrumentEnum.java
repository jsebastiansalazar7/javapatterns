package com.dojo.javapatterns.composite.orchestra.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.dojo.javapatterns.composite.orchestra.enums.InstrumentGroupEnum.*;

public enum InstrumentEnum {
    CELLO(STRINGS),
    VIOLIN(STRINGS),
    VIOLA(STRINGS),
    CONTRABASS(STRINGS),
    FLUTE(WOOD_WINDS),
    OBOE(WOOD_WINDS),
    CLARINET(WOOD_WINDS),
    FAGOTT(WOOD_WINDS),
    TRUMPET(BRASS),
    FRENCH_HORN(BRASS),
    TROMBONE(BRASS),
    EUPHONIUM(BRASS),
    TUBA(BRASS),
    TIMPANI(PERCUSSION),
    XYLOPHONE(PERCUSSION),
    CYMBALS(PERCUSSION),
    TRIANGLE(PERCUSSION),
    CELESTA(PERCUSSION),
    PIANO(PERCUSSION);

    private final InstrumentGroupEnum instrumentGroup;

    InstrumentEnum(InstrumentGroupEnum instrumentGroup) {
        this.instrumentGroup = instrumentGroup;
    }

    public InstrumentGroupEnum getInstrumentGroup() {
        return instrumentGroup;
    }

    public List<InstrumentEnum> getAllInstrumentsFromGroup(InstrumentGroupEnum instrumentGroup) {
        List<InstrumentEnum> instruments = Arrays.asList(InstrumentEnum.values());
        return instruments.stream()
                .filter(instrument -> instrumentGroup.equals(instrument.getInstrumentGroup()))
                .collect(Collectors.toList());
    }

}
