package com.dojo.javapatterns.bridge.artgallery.tools;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Tuner implements Tool {

    private ArtistTool artistTool;

    // Using a bridge to call the artist
    @Override
    public void useTool() {
        artistTool.makeArt();
    }
}
