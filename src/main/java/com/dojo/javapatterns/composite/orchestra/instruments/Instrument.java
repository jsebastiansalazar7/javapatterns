package com.dojo.javapatterns.composite.orchestra.instruments;

import com.dojo.javapatterns.composite.orchestra.enums.InstrumentEnum;
import com.dojo.javapatterns.composite.orchestra.enums.InstrumentGroupEnum;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class Instrument {

    private final UUID id;
    private final String name;
    private final InstrumentEnum instrument;
    private final InstrumentGroupEnum instrumentGroup;

}
