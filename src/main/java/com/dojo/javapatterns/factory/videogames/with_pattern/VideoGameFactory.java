package com.dojo.javapatterns.factory.videogames.with_pattern;

import com.dojo.javapatterns.factory.videogames.*;
import com.dojo.javapatterns.factory.videogames.enums.VideoGameGenreEnum;

public class VideoGameFactory {

    public static VideoGame.VideoGameBuilder getVideoGame(VideoGameGenreEnum videoGameGenre) {
        switch (videoGameGenre) {
            case FPS:
                return FpsVideoGame.builder();
            case HORROR:
                return HorrorVideoGame.builder();
            case INDEPENDENT:
                return IndependentVideoGame.builder();
            case RPG:
                return RpgVideoGame.builder();
            case SPORTS:
                return SportsVideoGame.builder();
            default:
                return null;
        }
    }
}
