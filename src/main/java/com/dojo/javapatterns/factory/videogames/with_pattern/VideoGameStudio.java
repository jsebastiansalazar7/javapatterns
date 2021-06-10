package com.dojo.javapatterns.factory.videogames.with_pattern;

import com.dojo.javapatterns.factory.videogames.VideoGame;
import com.dojo.javapatterns.factory.videogames.enums.*;

import java.util.Arrays;
import java.util.List;

public class VideoGameStudio {

    public static void main(String... args) {

        System.out.println("*** Welcome to our Video Game Studio Remaker.*** \n");

        VideoGame fpsVideoGame = VideoGameFactory.getVideoGame(VideoGameGenreEnum.FPS)
                .title("Call of Duty: Warzone")
                .description("Call of Duty: Warzone is a free-to-play battle royale video game released " +
                        "on March 10, 2020, for PlayStation 4, PlayStation 5, Xbox One, Xbox Series X/S, " +
                        "and Microsoft Windows.")
                .year(2020)
                .gameMode(Arrays.asList(GameModeEnum.SINGLE_PLAYER, GameModeEnum.MULTIPLAYER))
                .gameType(Arrays.asList(GameTypeEnum.LOCAL, GameTypeEnum.ONLINE))
                .platform(Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.PC))
                .studio(StudioEnum.INFINITY_WARD)
                .classification(ClassificationEnum.M)
                .budget(45000000.0f)
                .price(79.0f)
                .build();

        VideoGame horrorVideoGame = VideoGameFactory.getVideoGame(VideoGameGenreEnum.HORROR)
                .title("Outlast II")
                .description("Outlast 2 is a first-person psychological horror survival video game developed " +
                        "and published by Red Barrels.")
                .year(2020)
                .gameMode(Arrays.asList(GameModeEnum.SINGLE_PLAYER, GameModeEnum.MULTIPLAYER))
                .gameType(Arrays.asList(GameTypeEnum.LOCAL, GameTypeEnum.ONLINE))
                .platform(Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.PC))
                .studio(StudioEnum.INFINITY_WARD)
                .classification(ClassificationEnum.M)
                .budget(45000000.0f)
                .price(79.0f)
                .build();

        VideoGame independentVideoGame = VideoGameFactory.getVideoGame(VideoGameGenreEnum.INDEPENDENT)
                .title("Gris")
                .description("Gris is a platform-adventure game by Spanish developer Nomada Studio and published by " +
                        "Devolver Digital. The game was released for Nintendo Switch, macOS, and Microsoft Windows " +
                        "in December 2018, for iOS in August 2019, for PlayStation 4 in November 2019, " +
                        "and for Android in April 2020.")
                .year(2020)
                .gameMode(Arrays.asList(GameModeEnum.SINGLE_PLAYER))
                .gameType(Arrays.asList(GameTypeEnum.LOCAL))
                .platform(Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.NINTENDO, PlatformEnum.PC))
                .studio(StudioEnum.NOMADA_STUDIO)
                .classification(ClassificationEnum.E)
                .budget(800000.0f)
                .price(12.5f)
                .build();

        VideoGame rpgVideoGame = VideoGameFactory.getVideoGame(VideoGameGenreEnum.RPG)
                .title("Child of Light")
                .description("Child of Light is a platforming role-playing video game developed by Ubisoft Montreal " +
                        "and published by Ubisoft for Microsoft Windows, the PlayStation 3, PlayStation 4, " +
                        "Wii U, Xbox 360 and Xbox One in April 2014, and was released on PlayStation Vita " +
                        "in July 2014.")
                .year(2014)
                .gameMode(Arrays.asList(GameModeEnum.SINGLE_PLAYER))
                .gameType(Arrays.asList(GameTypeEnum.LOCAL))
                .platform(Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.NINTENDO, PlatformEnum.PC))
                .studio(StudioEnum.UBISOFT)
                .classification(ClassificationEnum.E)
                .budget(10000000.0f)
                .price(30.0f)
                .build();

        VideoGame sportsVideoGame = VideoGameFactory.getVideoGame(VideoGameGenreEnum.SPORTS)
                .title("Sonic & All-Stars Racing Transformed")
                .description("Sonic & All-Stars Racing Transformed, also known as Sonic Racing Transformed or " +
                        "Sonic Transformed, is a kart racing video game developed by Sumo Digital " +
                        "and published by Sega.")
                .year(2012)
                .gameMode(Arrays.asList(GameModeEnum.SINGLE_PLAYER))
                .gameType(Arrays.asList(GameTypeEnum.LOCAL))
                .platform(Arrays.asList(PlatformEnum.PLAY_STATION, PlatformEnum.XBOX, PlatformEnum.NINTENDO, PlatformEnum.PC))
                .studio(StudioEnum.RED_BARRELS)
                .classification(ClassificationEnum.E)
                .budget(4500000.0f)
                .price(19.0f)
                .build();

        List<VideoGame> videoGamesToRemake = Arrays.asList(fpsVideoGame, horrorVideoGame, independentVideoGame,
                rpgVideoGame, sportsVideoGame);

        System.out.println("The video games we will remake are:");
        videoGamesToRemake.forEach(videoGame -> System.out.println("* " + videoGame.getTitle()));

        System.out.println("\nDesign stage begins!");
        videoGamesToRemake.forEach(com.dojo.javapatterns.factory.videogames.with_pattern.VideoGameStudio::designVideoGame);

        System.out.println("\nDevelopment stage begins!");
        videoGamesToRemake.forEach(com.dojo.javapatterns.factory.videogames.with_pattern.VideoGameStudio::makeVideoGame);

        System.out.println("\nSelling stage begins!");
        videoGamesToRemake.forEach(com.dojo.javapatterns.factory.videogames.with_pattern.VideoGameStudio::sellVideoGame);
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
