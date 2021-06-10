package com.dojo.javapatterns.bridge.artgallery.tools;

import com.dojo.javapatterns.bridge.artgallery.artist.Artist;
import com.dojo.javapatterns.bridge.artgallery.enums.ArtTypeEnum;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ArtistTool {

    private String toolName;
    private List<ArtTypeEnum> applications;
    private Artist owner;

    public void makeArt() {
        owner.showArt();
    }

}
