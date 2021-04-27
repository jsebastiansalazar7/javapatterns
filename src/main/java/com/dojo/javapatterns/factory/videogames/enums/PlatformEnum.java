package com.dojo.javapatterns.factory.videogames.enums;

public enum PlatformEnum {
    PLAY_STATION("Play Station"),
    XBOX("Xbox"),
    NINTENDO("Nintendo"),
    PC("PC");

    private String platform;

    PlatformEnum(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
