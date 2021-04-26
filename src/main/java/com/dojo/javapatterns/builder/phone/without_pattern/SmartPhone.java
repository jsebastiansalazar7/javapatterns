package com.dojo.javapatterns.builder.phone.without_pattern;

import com.dojo.javapatterns.builder.phone.enums.NetworkTypeEnum;
import com.dojo.javapatterns.builder.phone.enums.ScreenTypeEnum;

import java.util.Arrays;

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

    public SmartPhone(String model, String brand, int year, int ram, int memory,
                      int[] frontCameraLenses, int[] rearCameraLenses, int battery,
                      float screenSize, ScreenTypeEnum screenType, boolean hasFingerPrintReader, boolean hasFaceUnlocking,
                      NetworkTypeEnum network, float price) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.ram = ram;
        this.memory = memory;
        this.frontCameraLenses = frontCameraLenses;
        this.rearCameraLenses = rearCameraLenses;
        this.battery = battery;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.hasFingerPrintReader = hasFingerPrintReader;
        this.hasFaceUnlocking = hasFaceUnlocking;
        this.network = network;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int[] getFrontCameraLenses() {
        return frontCameraLenses;
    }

    public void setFrontCameraLenses(int[] frontCameraLenses) {
        this.frontCameraLenses = frontCameraLenses;
    }

    public int[] getRearCameraLenses() {
        return rearCameraLenses;
    }

    public void setRearCameraLenses(int[] rearCameraLenses) {
        this.rearCameraLenses = rearCameraLenses;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public ScreenTypeEnum getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenTypeEnum screenType) {
        this.screenType = screenType;
    }

    public boolean isHasFingerPrintReader() {
        return hasFingerPrintReader;
    }

    public void setHasFingerPrintReader(boolean hasFingerPrintReader) {
        this.hasFingerPrintReader = hasFingerPrintReader;
    }

    public boolean isHasFaceUnlocking() {
        return hasFaceUnlocking;
    }

    public void setHasFaceUnlocking(boolean hasFaceUnlocking) {
        this.hasFaceUnlocking = hasFaceUnlocking;
    }

    public NetworkTypeEnum getNetwork() {
        return network;
    }

    public void setNetwork(NetworkTypeEnum network) {
        this.network = network;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", ram=" + ram +
                ", memory=" + memory +
                ", frontCameraLenses=" + Arrays.toString(frontCameraLenses) +
                ", rearCameraLenses=" + Arrays.toString(rearCameraLenses) +
                ", battery=" + battery +
                ", screenSize=" + screenSize +
                ", screenType=" + screenType +
                ", fingerPrintReader=" + hasFingerPrintReader +
                ", faceUnlocking=" + hasFaceUnlocking +
                ", network=" + network +
                ", price=" + price +
                '}';
    }

}

