package com.dojo.javapatterns.factory.videogames;

import com.dojo.javapatterns.factory.videogames.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Data
public abstract class VideoGame implements VideoGameProduction{

    private String title;
    private String description;
    private int year;
    private List<GameModeEnum> gameMode;
    private List<GameTypeEnum> gameType;
    private List<PlatformEnum> platform;
    private StudioEnum studio;
    private ClassificationEnum classification;
    private float budget;
    private float price;

    public VideoGame() {}

    public VideoGame(String title, String description, int year, List<GameModeEnum> gameMode, List<GameTypeEnum> gameType, List<PlatformEnum> platform, StudioEnum studio, ClassificationEnum classification, float budget, float price) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.gameMode = gameMode;
        this.gameType = gameType;
        this.platform = platform;
        this.studio = studio;
        this.classification = classification;
        this.budget = budget;
        this.price = price;
    }

    @Override
    public abstract void designGame();

    @Override
    public abstract void makeGame();

    @Override
    public abstract void sellGame();
}
