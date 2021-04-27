package com.dojo.javapatterns.factory.videogames.without_pattern;

import com.dojo.javapatterns.factory.videogames.*;
import com.dojo.javapatterns.factory.videogames.enums.*;

import java.util.Arrays;
import java.util.List;

public class VideoGameStudio {

    public static void main(String... args) {

        System.out.println("*** Welcome to our Video Game Studio Remaker.*** \n");

        VideoGame fpsVideoGame = new FpsVideoGame("Call of Duty: Warzone",
                "Call of Duty: Warzone is a free-to-play battle royale video game released " +
                        "on March 10, 2020, for PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, " +
                        "and Microsoft Windows.", 2020,
                Arrays.asList(GameModeEnum.SINGLE_PLAYER, GameModeEnum.MULTIPLAYER),
                Arrays.asList(GameTypeEnum.LOCAL, GameTypeEnum.ONLINE),
                Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.PC),
                StudioEnum.INFINITY_WARD, ClassificationEnum.M, 45000000.0f, 79.0f);

        VideoGame horrorVideoGame = new HorrorVideoGame("Outlast II",
                "Outlast 2 is a first-person psychological horror survival video game developed " +
                        "and published by Red Barrels.", 2020,
                Arrays.asList(GameModeEnum.SINGLE_PLAYER, GameModeEnum.MULTIPLAYER),
                Arrays.asList(GameTypeEnum.LOCAL, GameTypeEnum.ONLINE),
                Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.PC),
                StudioEnum.INFINITY_WARD, ClassificationEnum.M, 45000000.0f, 79.0f);

        VideoGame independentVideoGame = new IndependentVideoGame("Gris",
                "Gris is a platform-adventure game by Spanish developer Nomada Studio and published by " +
                        "Devolver Digital. The game was released for Nintendo Switch, macOS, and Microsoft Windows " +
                        "in December 2018, for iOS in August 2019, for PlayStation 4 in November 2019, " +
                        "and for Android in April 2020.", 2020,
                Arrays.asList(GameModeEnum.SINGLE_PLAYER),
                Arrays.asList(GameTypeEnum.LOCAL),
                Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.NINTENDO, PlatformEnum.PC),
                StudioEnum.NOMADA_STUDIO, ClassificationEnum.E, 800000.0f, 12.5f);

        VideoGame rpgVideoGame = new RpgVideoGame("Child of Light",
                "Child of Light is a platforming role-playing video game developed by Ubisoft Montreal " +
                        "and published by Ubisoft for Microsoft Windows, the PlayStation 3, PlayStation 4, " +
                        "Wii U, Xbox 360 and Xbox One in April 2014, and was released on PlayStation Vita " +
                        "in July 2014.", 2014,
                Arrays.asList(GameModeEnum.SINGLE_PLAYER),
                Arrays.asList(GameTypeEnum.LOCAL),
                Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.NINTENDO, PlatformEnum.PC),
                StudioEnum.UBISOFT, ClassificationEnum.E, 10000000.0f, 30.0f);

        VideoGame sportsVideoGame = new SportsVideoGame("Sonic & All-Stars Racing Transformed",
                "Sonic & All-Stars Racing Transformed, also known as Sonic Racing Transformed or " +
                        "Sonic Transformed, is a kart racing video game developed by Sumo Digital " +
                        "and published by Sega.", 2012,
                Arrays.asList(GameModeEnum.SINGLE_PLAYER),
                Arrays.asList(GameTypeEnum.LOCAL),
                Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.NINTENDO, PlatformEnum.PC),
                StudioEnum.RED_BARRELS, ClassificationEnum.E, 4500000.0f, 19.0f);

        List<VideoGame> videoGamesToRemake = Arrays.asList(fpsVideoGame, horrorVideoGame, independentVideoGame,
                rpgVideoGame, sportsVideoGame);

        System.out.println("The video games we will remake are:");
        videoGamesToRemake.forEach(videoGame -> System.out.println("* " + videoGame.getTitle()));

        System.out.println("\nDesign stage begins!");
        videoGamesToRemake.forEach(VideoGameStudio::designVideoGame);

        System.out.println("\nDevelopment stage begins!");
        videoGamesToRemake.forEach(VideoGameStudio::makeVideoGame);

        System.out.println("\nSelling stage begins!");
        videoGamesToRemake.forEach(VideoGameStudio::sellVideoGame);

    }

    private static void designVideoGame(VideoGame videoGame) {
        videoGame.designGame();
    }

    private static void makeVideoGame(VideoGame videoGame) {
        videoGame.makeGame();
    }

    private static void sellVideoGame(VideoGame videoGame) {
        videoGame.sellGame();
    }

}
