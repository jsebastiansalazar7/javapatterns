package com.dojo.javapatterns.adapter.wallsocket.enums;

public enum VoltageTypeEnum {
    LOW_VOLTAGE(new int[] {110, 220}),
    HIGH_VOLTAGE(new int[] {220, 230}),
    INDUSTRIAL_VOLTAGE(new int[] {350, 440, 600, 800, 1000, 1200, 2400, 4000});

    private final int[] voltageLevels;

    VoltageTypeEnum(int[] voltageLevels) {
        this.voltageLevels = voltageLevels;
    }

    public int[] getVoltageLevels() {
        return voltageLevels;
    }
}
