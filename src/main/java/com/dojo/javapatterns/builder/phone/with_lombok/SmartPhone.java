package com.dojo.javapatterns.builder.phone.with_lombok;

import com.dojo.javapatterns.builder.phone.enums.NetworkTypeEnum;
import com.dojo.javapatterns.builder.phone.enums.ScreenTypeEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmartPhone {

    private String model;
    private String brand;
    private int year;
    private int ram;
    private int memory;
    private int[] frontCameraLenses;
    private int[] rearCameraLenses;
    private int battery;
    private float screenSize;
    private ScreenTypeEnum screenType;
    private boolean hasFingerPrintReader;
    private boolean hasFaceUnlocking;
    private NetworkTypeEnum network;
    private float price;

}
