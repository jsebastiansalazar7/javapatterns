package com.dojo.javapatterns.composite.orchestra.groups;

import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.utils.InstrumentGroupUtilities;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Percussion implements InstrumentGroup {

    List<Instrument> percussionInstruments;

    @Override
    public void fineTune() {
        System.out.println("Percussions are fine tunning their instruments");
    }

    @Override
    public void play() {
        System.out.println("Percussions instruments are playing with the orchestra");
    }

    @Override
    public void stop() {
        System.out.println("Percussions instruments have stopped playing with the orchestra");
    }

    @Override
    public void performSolo(Instrument instrument) {
        System.out.println("The Percussion instrument " + instrument.getName() +
                " is making a solo");
    }

    @Override
    public void thankThePublic() {
        System.out.println("The Percussion instruments are thanking the public");
    }

    @Override
    public List<Instrument> getAllInstruments() {
        return percussionInstruments;
    }

    @Override
    public List<Instrument> getInstrumentsByName(InstrumentEnum instrumentName) {
        return InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, instrumentName);
    }

    @Override
    public void showCompositionOfGroup() {
        List<Instrument> timpanis = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.TIMPANI);
        List<Instrument> xylophones = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.XYLOPHONE);
        List<Instrument> cymbals = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.CYMBALS);
        List<Instrument> triangles = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.TRIANGLE);
        List<Instrument> celestas = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.CELESTA);
        List<Instrument> pianos = InstrumentGroupUtilities.getInstrumentsByName(percussionInstruments, InstrumentEnum.PIANO);
        System.out.println("There are " + timpanis.size() + " timpanis, " + xylophones.size() + " xilophones, " +
                cymbals.size() + " cymbals, " + triangles.size() + " triangles, " + celestas.size() + " celestas, " +
                pianos.size() + " pianos");
    }
}
