package com.dojo.javapatterns.adapter.musicplayer.mediadevices;

import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import com.dojo.javapatterns.adapter.musicplayer.mediaformats.Mp3Format;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Mp3Player extends MediaDevice implements Mp3Format {

    @Override
    public MediaFormatTypeEnum availableMediaFormat() {
        return MediaFormatTypeEnum.MP3;
    }

    @Override
    public void playMp3Media() {
        System.out.println("Attempting to play MP3 media...");
        playMedia(availableMediaFormat());
    }

}
