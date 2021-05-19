package com.dojo.javapatterns.composite.orchestra;

import com.dojo.javapatterns.composite.orchestra.director.Director;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.groups.Brass;
import com.dojo.javapatterns.composite.orchestra.groups.Percussion;
import com.dojo.javapatterns.composite.orchestra.groups.Strings;
import com.dojo.javapatterns.composite.orchestra.groups.WoodWinds;
import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.orchestra.Orchestra;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcertOrganizer {

    public Director getDirector(Orchestra orchestra) {
        return Director.builder()
                .name("Hans Zimmer")
                .orchestra(orchestra)
                .build();
    }

    public Orchestra getOrchestra() {
        return Orchestra.builder()
                .strings(getStrings())
                .woodWinds(getWoodWinds())
                .brasses(getBrasses())
                .percussions(getPercussions())
                .build();
    }

    private Strings getStrings() {
        List<Instrument> violins = getInstruments(InstrumentEnum.VIOLIN, 8);
        List<Instrument> violas = getInstruments(InstrumentEnum.VIOLA, 4);
        List<Instrument> cellos = getInstruments(InstrumentEnum.CELLO, 4);
        List<Instrument> contrabasses = getInstruments(InstrumentEnum.CONTRABASS, 2);
        List<Instrument> stringInstruments = Stream.of(violins, violas, cellos, contrabasses)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        return Strings.builder()
                .stringInstruments(stringInstruments)
                .build();
    }

    private WoodWinds getWoodWinds() {
        List<Instrument> flutes = getInstruments(InstrumentEnum.FLUTE, 6);
        List<Instrument> oboes = getInstruments(InstrumentEnum.OBOE, 2);
        List<Instrument> clarinets = getInstruments(InstrumentEnum.CLARINET, 6);
        List<Instrument> fagotts = getInstruments(InstrumentEnum.FAGOTT, 4);
        List<Instrument> woodWindInstruments = Stream.of(flutes, oboes, clarinets, fagotts)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        return WoodWinds.builder()
                .woodWindInstruments(woodWindInstruments)
                .build();
    }

    private Brass getBrasses() {
        List<Instrument> trumpets = getInstruments(InstrumentEnum.TRUMPET, 4);
        List<Instrument> frenchHorns = getInstruments(InstrumentEnum.FRENCH_HORN, 6);
        List<Instrument> trombones = getInstruments(InstrumentEnum.TROMBONE, 4);
        List<Instrument> euphoniums = getInstruments(InstrumentEnum.EUPHONIUM, 2);
        List<Instrument> tubas = getInstruments(InstrumentEnum.TUBA, 2);
        List<Instrument> brassInstruments = Stream.of(trumpets, frenchHorns, trombones, euphoniums, tubas)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        return Brass.builder()
                .brassInstruments(brassInstruments)
                .build();
    }

    private Percussion getPercussions() {
        List<Instrument> timpanis = getInstruments(InstrumentEnum.TIMPANI, 1);
        List<Instrument> xylophones = getInstruments(InstrumentEnum.XYLOPHONE, 1);
        List<Instrument> cymbals = getInstruments(InstrumentEnum.CYMBALS, 2);
        List<Instrument> triangles = getInstruments(InstrumentEnum.TRIANGLE, 1);
        List<Instrument> celestas = getInstruments(InstrumentEnum.CELESTA, 1);
        List<Instrument> pianos = getInstruments(InstrumentEnum.PIANO, 1);
        List<Instrument> percussionInstruments = Stream.of(timpanis, xylophones, cymbals, triangles, celestas, pianos)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        return Percussion.builder()
                .percussionInstruments(percussionInstruments)
                .build();
    }

    private List<Instrument> getInstruments(InstrumentEnum instrumentEnum, int amount) {
        List<Instrument> instruments = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            Instrument instrument = Instrument.builder()
                    .id(UUID.randomUUID())
                    .name(instrumentEnum.name().toLowerCase() + " " + ++i)
                    .instrument(instrumentEnum)
                    .instrumentGroup(instrumentEnum.getInstrumentGroup())
                    .build();
            instruments.add(instrument);
        }
        return instruments;
    }
}
