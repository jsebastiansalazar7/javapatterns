package com.dojo.javapatterns.bridge.artgallery;

import com.dojo.javapatterns.bridge.artgallery.artist.Artist;
import com.dojo.javapatterns.bridge.artgallery.artist.ArtistDetails;
import com.dojo.javapatterns.bridge.artgallery.artist.Performer;
import com.dojo.javapatterns.bridge.artgallery.artist.VisualArtist;
import com.dojo.javapatterns.bridge.artgallery.enums.ArtTypeEnum;
import com.dojo.javapatterns.bridge.artgallery.enums.ArtistTypeEnum;
import com.dojo.javapatterns.bridge.artgallery.enums.ArtworkEnum;
import com.dojo.javapatterns.bridge.artgallery.tools.ArtistTool;
import com.dojo.javapatterns.bridge.artgallery.tools.Brush;
import com.dojo.javapatterns.bridge.artgallery.tools.Hammer;
import com.dojo.javapatterns.bridge.artgallery.tools.Tuner;

import java.util.Arrays;
import java.util.Collections;

public class ArtGallery {

    public static void main(String... args) {
        System.out.println("*** Art Gallery is opening it's doors ***");

        System.out.println("The artists are setting all things up...");

        // Painter set-up
        ArtistDetails painterDetails = ArtistDetails.builder()
                .name("Giulano Corchetti")
                .artistType(ArtistTypeEnum.PAINTER)
                .build();
        Artist painter = new VisualArtist(painterDetails, ArtworkEnum.GIOCONDA);
        // Painter tools
        ArtistTool painterTool = ArtistTool.builder()
                .toolName("Italian grade 4 brush")
                .applications(Collections.singletonList(ArtTypeEnum.PAINTING))
                .owner(painter)
                .build();
        Brush brush = Brush.builder()
                .artistTool(painterTool)
                .build();

        // Sculptor set-up
        ArtistDetails sculptorDetails = ArtistDetails.builder()
                .name("Stephen Antonakos")
                .artistType(ArtistTypeEnum.SCULPTOR)
                .build();
        Artist sculptor = new VisualArtist(sculptorDetails, ArtworkEnum.DAVID);
        // Sculptor tools
        ArtistTool sculptorTool = ArtistTool.builder()
                .toolName("Precision hammer")
                .applications(Arrays.asList(ArtTypeEnum.SCULPTURE, ArtTypeEnum.ARCHITECTURE))
                .owner(sculptor)
                .build();
        Hammer hammer = Hammer.builder()
                .artistTool(sculptorTool)
                .build();

        // Guitarist set-up
        ArtistDetails guitaristDetails = ArtistDetails.builder()
                .name("José Balmaceda")
                .artistType(ArtistTypeEnum.MUSICIAN)
                .build();
        Artist guitarist = new Performer(guitaristDetails, ArtworkEnum.STAIRWAY_TO_HEAVEN);
        // Guitarist tools
        ArtistTool guitaristTool = ArtistTool.builder()
                .toolName("Pioneer Tuner")
                .applications(Collections.singletonList(ArtTypeEnum.MUSIC))
                .owner(guitarist)
                .build();
        Tuner tuner = Tuner.builder()
                .artistTool(guitaristTool)
                .build();

        System.out.println("The artist are ready. Let the art begin!");

        System.out.println("\nHere comes our first artist!");
        painter.presentItself();
        painter.prepareStage();
        System.out.println("Now we will see how this " + painterTool.getToolName() + " is used!");
        brush.useTool(); // Making use of bridge to reach the artist method showArt()

        System.out.println("\nThat was amazing! Now, let's see what our second artist is capable of...");
        sculptor.presentItself();
        sculptor.prepareStage();
        System.out.println("Now we will see how this " + sculptorTool.getToolName() + " is used!");
        hammer.useTool(); // Making use of bridge to reach the artist method showArt()

        System.out.println("\nWow! Outstanding! We will close now with our last artist...");
        guitarist.presentItself();
        guitarist.prepareStage();
        System.out.println("Now we will see how this " + guitaristTool.getToolName() + " is used!");
        tuner.useTool(); // Making use of bridge to reach the artist method showArt()
    }
}
