package com.dojo.javapatterns.builder.house.without_pattern;

import com.dojo.javapatterns.builder.house.enums.ArchitectureStyleEnum;
import com.dojo.javapatterns.builder.house.enums.ColorEnum;
import com.dojo.javapatterns.builder.house.enums.HouseStyleEnum;
import com.dojo.javapatterns.builder.house.enums.MaterialEnum;

public class House {
    private float area;
    private int numberOfFloors;
    private int numberOfBathrooms;
    private int numberOfRooms;
    private MaterialEnum material;
    private ColorEnum color;
    private HouseStyleEnum houseStyle;
    private ArchitectureStyleEnum architecturaStyle;
    private boolean hasSewerage;
    private boolean hasElectricity;
    private boolean hasInternet;
    private boolean hasBuiltInSecurity;
    private float price;

    public House(float area, int numberOfFloors, int numberOfBathrooms, int numberOfRooms,
                 MaterialEnum material, ColorEnum color, HouseStyleEnum houseStyle,
                 ArchitectureStyleEnum architecturaStyle, boolean hasSewerage, boolean hasElectricity,
                 boolean hasInternet, boolean hasBuiltInSecurity, float price) {
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfRooms = numberOfRooms;
        this.material = material;
        this.color = color;
        this.houseStyle = houseStyle;
        this.architecturaStyle = architecturaStyle;
        this.hasSewerage = hasSewerage;
        this.hasElectricity = hasElectricity;
        this.hasInternet = hasInternet;
        this.hasBuiltInSecurity = hasBuiltInSecurity;
        this.price = price;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public MaterialEnum getMaterial() {
        return material;
    }

    public void setMaterial(MaterialEnum material) {
        this.material = material;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public HouseStyleEnum getHouseStyle() {
        return houseStyle;
    }

    public void setHouseStyle(HouseStyleEnum houseStyle) {
        this.houseStyle = houseStyle;
    }

    public ArchitectureStyleEnum getArchitecturaStyle() {
        return architecturaStyle;
    }

    public void setArchitecturaStyle(ArchitectureStyleEnum architecturaStyle) {
        this.architecturaStyle = architecturaStyle;
    }

    public boolean isHasSewerage() {
        return hasSewerage;
    }

    public void setHasSewerage(boolean hasSewerage) {
        this.hasSewerage = hasSewerage;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public boolean isHasBuiltInSecurity() {
        return hasBuiltInSecurity;
    }

    public void setHasBuiltInSecurity(boolean hasBuiltInSecurity) {
        this.hasBuiltInSecurity = hasBuiltInSecurity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfRooms=" + numberOfRooms +
                ", material=" + material +
                ", color=" + color +
                ", houseStyle=" + houseStyle +
                ", architecturaStyle=" + architecturaStyle +
                ", hasSewerage=" + hasSewerage +
                ", hasElectricity=" + hasElectricity +
                ", hasInternet=" + hasInternet +
                ", hasBuiltInSecurity=" + hasBuiltInSecurity +
                ", price=" + price +
                '}';
    }
}
