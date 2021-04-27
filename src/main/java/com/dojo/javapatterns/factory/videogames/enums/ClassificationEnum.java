package com.dojo.javapatterns.factory.videogames.enums;

public enum ClassificationEnum {
    E("Everyone"),
    E_PLUS("Everyone 10+"),
    T("Teen"),
    M("Mature 17+"),
    A("Adults Only 18+"),
    RP("Rating Pending");

    private String description;

    ClassificationEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
