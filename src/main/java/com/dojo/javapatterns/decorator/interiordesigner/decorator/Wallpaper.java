package com.dojo.javapatterns.decorator.interiordesigner.decorator;

import com.dojo.javapatterns.decorator.interiordesigner.enums.DecorationStyleEnum;
import com.dojo.javapatterns.decorator.interiordesigner.enums.WallpaperEnum;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Wallpaper extends RoomActionsDecorator {

    private WallpaperEnum wallpaper;

    @Override
    public void decorate(DecorationStyleEnum decorationStyle) {
        super.decorate(decorationStyle);
        putWallpaper();
    }

    public void putWallpaper() {
        System.out.println("Put " + wallpaper.name().toLowerCase() + " wallpaper");
    }
}
