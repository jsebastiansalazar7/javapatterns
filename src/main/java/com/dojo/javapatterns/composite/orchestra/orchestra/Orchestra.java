package com.dojo.javapatterns.composite.orchestra.orchestra;

import com.dojo.javapatterns.composite.orchestra.enums.InstrumentGroupEnum;
import com.dojo.javapatterns.composite.orchestra.groups.*;
import lombok.Builder;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Builder
@Data
public class Orchestra {
    Strings strings;
    WoodWinds woodWinds;
    Brass brasses;
    Percussion percussions;

    public InstrumentGroup getInstrumentGroup(InstrumentGroupEnum instrumentGroup) {
        switch (instrumentGroup) {
            case WOOD_WINDS:
                return woodWinds;
            case BRASS:
                return brasses;
            case PERCUSSION:
                return percussions;
            case STRINGS:
            default:
                return strings;
        }
    }

    public List<InstrumentGroup> getInstrumentGroups() {
        return Arrays.asList(strings, woodWinds, brasses, percussions);
    }
}
