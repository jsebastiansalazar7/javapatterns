package com.dojo.javapatterns.adapter.musicplayer.adapters;

import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import com.dojo.javapatterns.adapter.musicplayer.mediadevices.MediaDevice;

public class FormatAdapterToMp3 extends MediaDevice implements FormatAdapter {

    private static final MediaFormatTypeEnum adaptedFormat;

    static {
        adaptedFormat = MediaFormatTypeEnum.MP3;
    }

    public FormatAdapterToMp3(String adapterName) {
        super(adapterName, adaptedFormat, 0.0, 0);
    }

    @Override
    public void loadMedia(MediaDevice mediaDevice) {
        System.out.println("\n* Adapter attempting to play MP3 format from device: " + mediaDevice.toString());
        this.playMedia(this.getMediaFormatType());
        mediaDevice.playMedia(mediaDevice.getMediaFormatType());
        System.out.println("* Playing MP3 format through an adapter.");

    }
}
