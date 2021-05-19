package com.dojo.javapatterns.adapter.wallsocket.enums;

public enum FrequencyTypeEnum {
    LOW(50),
    HIGH(60);

    private final int frequency;

    FrequencyTypeEnum(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }
}
