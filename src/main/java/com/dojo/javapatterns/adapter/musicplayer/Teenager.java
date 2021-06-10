package com.dojo.javapatterns.adapter.musicplayer;

import com.dojo.javapatterns.adapter.musicplayer.adapters.FormatAdapterToMp3;
import com.dojo.javapatterns.adapter.musicplayer.adapters.FormatAdapterToMp4;
import com.dojo.javapatterns.adapter.musicplayer.enums.MediaFormatTypeEnum;
import com.dojo.javapatterns.adapter.musicplayer.mediadevices.Mp3Player;
import com.dojo.javapatterns.adapter.musicplayer.mediadevices.Mp4Player;

public class Teenager {

    public static void main(String... args) {
        System.out.println("*** A teenager is preparing his media devices to enjoy in the back of the car ***");
        Mp3Player mp3Player = Mp3Player.builder()
                .name("Master G MP3 Player")
                .mediaFormatType(MediaFormatTypeEnum.MP3)
                .storage(15.0)
                .batteryCapacity(3400)
                .build();
        Mp4Player mp4Player = Mp4Player.builder()
                .name("Mini Walkman")
                .mediaFormatType(MediaFormatTypeEnum.MP4)
                .storage(119.8)
                .batteryCapacity(8000)
                .build();

        System.out.println("\nThe teenager media devices are:");
        System.out.println("* " + mp3Player.toString());
        System.out.println("* " + mp4Player.toString());

        System.out.println("\n*** The teenager will try to play supported media in his devices ***");
        mp3Player.playMp3Media();
        mp4Player.playMp4Media();

        System.out.println("\n*** The teenager will try to play different media in his devices ***");
        mp3Player.playMedia(MediaFormatTypeEnum.MP4);
        mp4Player.playMedia(MediaFormatTypeEnum.MP3);

        System.out.println("\n*** The teenager will use an adapter to load unsupported media in his devices ***");
        FormatAdapterToMp4 formatAdapterToMp4 = new FormatAdapterToMp4("-=SUPER MP4 ADAPTER=-");
        formatAdapterToMp4.loadMedia(mp3Player);
        FormatAdapterToMp3 formatAdapterToMp3 = new FormatAdapterToMp3("~SIMPLE MP3 ADAPTER~");
        formatAdapterToMp3.loadMedia(mp4Player);
    }
}
