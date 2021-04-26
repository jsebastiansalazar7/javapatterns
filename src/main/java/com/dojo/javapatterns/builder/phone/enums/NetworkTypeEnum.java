package com.dojo.javapatterns.builder.phone.enums;

public enum NetworkTypeEnum {
    SECOND_GENERATION("2G"),
    THIRD_GENERATION("3G"),
    FORTH_GENERATION("4G"),
    FIFTH_GENERATION("5G");

    private final String network;

    NetworkTypeEnum(String network) {
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }
}
