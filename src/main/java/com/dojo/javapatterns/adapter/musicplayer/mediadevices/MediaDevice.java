package com.dojo.javapatterns.adapter.musicplayer.mediadevices;

import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@Data
public abstract class MediaDevice {
    private String name;
    private MediaFormatTypeEnum mediaFormatType;
    private double storage;
    private int batteryCapacity;

    public void playMedia(MediaFormatTypeEnum availableMediaFormat) {
        if (availableMediaFormat.equals(mediaFormatType)) {
            System.out.println("The media device " + name + " is playing the format requested.");
        } else {
            System.out.println("The media device " + name + " is not able to play the format requested. " +
                    "It only supports " + mediaFormatType + " format.");
        }

    }
}
