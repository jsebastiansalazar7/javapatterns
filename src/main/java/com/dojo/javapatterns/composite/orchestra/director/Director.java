package com.dojo.javapatterns.composite.orchestra.director;

import com.dojo.javapatterns.composite.orchestra.orchestra.Orchestra;
import com.dojo.javapatterns.composite.orchestra.groups.InstrumentGroup;
import com.dojo.javapatterns.composite.orchestra.instruments.Instrument;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Director {

    private String name;
    private Orchestra orchestra;

    public void requestFineTunning() {
        System.out.println("The director has requested the orchestra to fine tune");
        orchestra.getInstrumentGroups().forEach(InstrumentGroup::fineTune);
    }

    public void requestStartPlaying(String piece) {
        System.out.println("The director has requested the orchestra to start playing " + piece);
        orchestra.getInstrumentGroups().forEach(InstrumentGroup::play);
    }

    public void requestPause() {
        System.out.println("The director has requested the orchestra to pause");
        orchestra.getInstrumentGroups().forEach(InstrumentGroup::stop);

    }

    public void requestSolo(Instrument instrument) {
        System.out.println("The director has requested the orchestra to pause since " + instrument.getName() +
                " will play a solo");
        InstrumentGroup instrumentGroup = orchestra.getInstrumentGroup(instrument.getInstrumentGroup());
        instrumentGroup.performSolo(instrument);
    }

    public void requestThanks() {
        System.out.println("The director has requested the orchestra to thank the public");
        orchestra.getInstrumentGroups().forEach(InstrumentGroup::thankThePublic);
    }

    public void requestSilenceToThePublic() {
        System.out.println("The director has requested the public to make silence");
    }

}
