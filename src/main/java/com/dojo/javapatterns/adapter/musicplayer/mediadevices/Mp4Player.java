package com.dojo.javapatterns.adapter.musicplayer.mediadevices;

import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import com.dojo.javapatterns.adapter.musicplayer.mediaformats.Mp4Format;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Mp4Player extends MediaDevice implements Mp4Format {

    @Override
    public MediaFormatTypeEnum availableMediaFormat() {
        return MediaFormatTypeEnum.MP4;
    }

    @Override
    public void playMp4Media() {
        System.out.println("Attempting to play MP4 media...");
        playMedia(availableMediaFormat());
    }

}
