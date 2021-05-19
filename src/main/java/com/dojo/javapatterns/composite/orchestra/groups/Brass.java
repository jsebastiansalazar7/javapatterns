package com.dojo.javapatterns.composite.orchestra.groups;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.utils.InstrumentGroupUtilities;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Brass implements InstrumentGroup {

    List<Instrument> brassInstruments;

    @Override
    public void fineTune() {
        System.out.println("Brass instruments are fine tunning their instruments");
    }

    @Override
    public void play() {
        System.out.println("Brass instruments instruments are playing with the orchestra");
    }

    @Override
    public void stop() {
        System.out.println("Brass instruments instruments have stopped playing with the orchestra");
    }

    @Override
    public void performSolo(Instrument instrument) {
        System.out.println("The brass instrument " + instrument.getName() +
                " is making a solo");
    }

    @Override
    public void thankThePublic() {
        System.out.println("The brass instruments are thanking the public");
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return brassInstruments;
    }

    @Override
    public List<Instrument> getInstrumentsByName(InstrumentEnum instrumentName) {
        return InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, instrumentName);
    }

    @Override
    public void showCompositionOfGroup() {
        List<Instrument> trumpets = InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, InstrumentEnum.TRUMPET);
        List<Instrument> frenchHorns = InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, InstrumentEnum.FRENCH_HORN);
        List<Instrument> trombones = InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, InstrumentEnum.TROMBONE);
        List<Instrument> euphoniums = InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, InstrumentEnum.EUPHONIUM);
        List<Instrument> tubas = InstrumentGroupUtilities.getInstrumentsByName(brassInstruments, InstrumentEnum.TUBA);
        System.out.println("There are " + trumpets.size() + " trumpets, " + frenchHorns.size() + " french horns, " +
                trombones.size() + " trombones, " + euphoniums.size() + " euphoniums, " + tubas.size() + " tubas");
    }
}
