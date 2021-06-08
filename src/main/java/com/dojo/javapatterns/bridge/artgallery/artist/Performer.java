package com.dojo.javapatterns.bridge.artgallery.artist;

import com.dojo.javapatterns.bridge.artgallery.enums.ArtworkEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Performer implements Artist {

    private ArtistDetails artistDetails;
    private ArtworkEnum artwork;

    @Override
    public void presentItself() {
        System.out.println("\n- Hello! I'm " + artistDetails.getName() + " and I'm a " + artistDetails.getArtistType().toString() + ".");
        System.out.println("*** JUMPS ON THE STAGE RAISING ITS HANDS ***");
    }

    @Override
    public void prepareStage() {
        System.out.println("\n*** THE ARTIST IS SETTING ITS TOOLS ON THE STAGE ***");
    }

    @Override
    public void showArt() {
        System.out.println("\n- Yasss!");
        System.out.println(
                "*** PERFORMS PERFECT " +
                        getArtwork().getArtType() +
                        " OF " + getArtwork().toString() +
                        " FROM " + getArtwork().getArtist() + " ***");
    }

}
