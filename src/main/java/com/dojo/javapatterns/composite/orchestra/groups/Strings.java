package com.dojo.javapatterns.composite.orchestra.groups;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.utils.InstrumentGroupUtilities;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Strings implements InstrumentGroup {

    List<Instrument> stringInstruments;

    @Override
    public void fineTune() {
        System.out.println("Strings are fine tunning their instruments");
    }

    @Override
    public void play() {
        System.out.println("String instruments are playing with the orchestra");
    }

    @Override
    public void stop() {
        System.out.println("String instruments have stopped playing with the orchestra");
    }

    @Override
    public void performSolo(Instrument instrument) {
        System.out.println("The String instrument " + instrument.getName() +
                " is making a solo");
    }

    @Override
    public void thankThePublic() {
        System.out.println("The string instruments are thanking the public");
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return stringInstruments;
    }

    @Override
    public List<Instrument> getInstrumentsByName(InstrumentEnum instrumentName) {
        return InstrumentGroupUtilities.getInstrumentsByName(stringInstruments, instrumentName);
    }

    @Override
    public void showCompositionOfGroup() {
        List<Instrument> violins = InstrumentGroupUtilities.getInstrumentsByName(stringInstruments, InstrumentEnum.VIOLIN);
        List<Instrument> violas = InstrumentGroupUtilities.getInstrumentsByName(stringInstruments, InstrumentEnum.VIOLA);
        List<Instrument> cellos = InstrumentGroupUtilities.getInstrumentsByName(stringInstruments, InstrumentEnum.CELLO);
        List<Instrument> contrabasses = InstrumentGroupUtilities.getInstrumentsByName(stringInstruments, InstrumentEnum.CONTRABASS);
        System.out.println("There are " + violins.size() + " violins, " + violas.size() + " violas, " +
                cellos.size() + " cellos, " + contrabasses.size() + " contrabasses");
    }

}
