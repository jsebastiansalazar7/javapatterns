package com.dojo.javapatterns.bridge.artgallery.enums;

import static com.dojo.javapatterns.bridge.artgallery.enums.ArtTypeEnum.*;

public enum ArtworkEnum {
    GIOCONDA(PAINTING, "Leonardo da Vinci"),
    DAVID(SCULPTURE, "Michelangelo"),
    STAIRWAY_TO_HEAVEN(MUSIC, "Led Zepelin");

    private final ArtTypeEnum artType;
    private final String artist;

    ArtworkEnum(ArtTypeEnum artType, String artist) {
        this.artType = artType;
        this.artist = artist;
    }

    public ArtTypeEnum getArtType() {
        return artType;
    }

    public String getArtist() {
        return artist;
    }

}
