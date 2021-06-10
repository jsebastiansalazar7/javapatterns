package com.dojo.javapatterns.bridge.artgallery.artist;

import com.dojo.javapatterns.bridge.artgallery.enums.ArtistTypeEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArtistDetails {

    private String name;
    private ArtistTypeEnum artistType;

}