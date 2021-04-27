package com.dojo.javapatterns.factory.videogames;

import com.dojo.javapatterns.factory.videogames.enums.*;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@Data
public class IndependentVideoGame extends VideoGame {

    public IndependentVideoGame(String title, String description, int year, List<GameModeEnum> gameMode,
                        List<GameTypeEnum> gameType, List<PlatformEnum> platform, StudioEnum studio,
                        ClassificationEnum classification, float budget, float price) {
        super(title, description, year, gameMode, gameType, platform, studio, classification, budget, price);
    }

    @Override
    public void designGame() {
        System.out.println("- Design for the Independent video game " + this.getTitle() + " has started");
    }

    @Override
    public void makeGame() {
        System.out.println("- Production for the Independent video game " + this.getTitle() +
                " with a budget of $" + this.getBudget() + " has started");
    }

    @Override
    public void sellGame() {
        StringBuilder platformStringBuilder = new StringBuilder();
        this.getPlatform().forEach(platform -> platformStringBuilder.append(platform.getPlatform().concat(", ")));
        int platformStringLenght = platformStringBuilder.length();
        platformStringBuilder.delete(platformStringLenght - 2, platformStringLenght);

        System.out.println("- The Independent video game " + this.getTitle() +
                " is ready.  It will be sold at $" + this.getPrice() +
                " per unit in the following platforms: " + platformStringBuilder.toString());
    }
}
