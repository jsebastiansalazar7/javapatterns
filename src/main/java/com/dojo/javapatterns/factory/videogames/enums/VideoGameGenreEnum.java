package com.dojo.javapatterns.factory.videogames.enums;

public enum VideoGameGenreEnum {

    FPS("FPS"),
    HORROR("Horror"),
    INDEPENDENT("Independent"),
    RPG("RPG"),
    SPORTS("Sports");

    private String videogameGenre;

    VideoGameGenreEnum(String videogameGenre) {
        this.videogameGenre = videogameGenre;
    }

    public String getVideogameGenre() {
        return videogameGenre;
    }
}
