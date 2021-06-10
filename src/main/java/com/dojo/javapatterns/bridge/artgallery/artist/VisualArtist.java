package com.dojo.javapatterns.bridge.artgallery.artist;

import com.dojo.javapatterns.bridge.artgallery.enums.ArtworkEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class VisualArtist implements Artist {

    private ArtistDetails artistDetails;
    private ArtworkEnum artwork;

    @Override
    public void presentItself() {
        System.out.println("\n- Hello! I'm " + artistDetails.getName() + " and I'm a " + artistDetails.getArtistType().toString() + ".");
        System.out.println("*** MOVES ITS HANDS WITH MYSTERY ***");
    }

    @Override
    public void prepareStage() {
        System.out.println("\n*** THE ARTIST IS ASSEMBLING ITS TOOLS ***");
    }

    @Override
    public void showArt() {
        System.out.println("\n- Voilá!");
        System.out.println(
                "*** SHOWS A BEAUTIFUL " +
                getArtwork().getArtType() +
                " OF " + getArtwork().toString() +
                " FROM " + getArtwork().getArtist() + " ***");
    }

}
