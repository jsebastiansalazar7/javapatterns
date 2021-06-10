package com.dojo.javapatterns.adapter.musicplayer.adapters;

import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import com.dojo.javapatterns.adapter.musicplayer.mediadevices.MediaDevice;

public class FormatAdapterToMp4 extends MediaDevice implements FormatAdapter {

    private static final MediaFormatTypeEnum adaptedFormat;

    static {
        adaptedFormat = MediaFormatTypeEnum.MP4;
    }

    public FormatAdapterToMp4(String adapterName) {
        super(adapterName, adaptedFormat, 0.0, 0);
    }

    @Override
    public void loadMedia(MediaDevice mediaDevice) {
        System.out.println("* Adapter attempting to play MP4 format from device: " + mediaDevice.toString());
        this.playMedia(this.getMediaFormatType());
        mediaDevice.playMedia(mediaDevice.getMediaFormatType());
        System.out.println("* Playing MP4 format through an adapter.");
    }
}
