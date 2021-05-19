package com.dojo.javapatterns.composite.orchestra.groups;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.utils.InstrumentGroupUtilities;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class WoodWinds implements InstrumentGroup {

    List<Instrument> woodWindInstruments;

    @Override
    public void fineTune() {
        System.out.println("Wood winds are fine tunning their instruments");
    }

    @Override
    public void play() {
        System.out.println("Wood winds instruments are playing with the orchestra");
    }

    @Override
    public void stop() {
        System.out.println("Wood winds instruments have stopped playing with the orchestra");
    }

    @Override
    public void performSolo(Instrument instrument) {
        System.out.println("The wood wind instrument " + instrument.getName() +
                " is making a solo");
    }

    @Override
    public void thankThePublic() {
        System.out.println("The wood wind instruments are thanking the public");
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return woodWindInstruments;
    }

    @Override
    public List<Instrument> getInstrumentsByName(InstrumentEnum instrumentName) {
        return InstrumentGroupUtilities.getInstrumentsByName(woodWindInstruments, instrumentName);
    }

    @Override
    public void showCompositionOfGroup() {
        List<Instrument> flutes = InstrumentGroupUtilities.getInstrumentsByName(woodWindInstruments, InstrumentEnum.FLUTE);
        List<Instrument> oboes = InstrumentGroupUtilities.getInstrumentsByName(woodWindInstruments, InstrumentEnum.OBOE);
        List<Instrument> clarinets = InstrumentGroupUtilities.getInstrumentsByName(woodWindInstruments, InstrumentEnum.CLARINET);
        List<Instrument> fagotts = InstrumentGroupUtilities.getInstrumentsByName(woodWindInstruments, InstrumentEnum.FAGOTT);
        System.out.println("There are " + flutes.size() + " flutes, " + oboes.size() + " oboes, " +
                clarinets.size() + " clarinets, " + fagotts.size() + " fagotts");
    }
}
