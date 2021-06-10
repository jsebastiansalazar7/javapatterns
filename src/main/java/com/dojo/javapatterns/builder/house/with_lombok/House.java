package com.dojo.javapatterns.builder.house.with_lombok;

import com.dojo.javapatterns.builder.house.enums.ArchitectureStyleEnum;
import com.dojo.javapatterns.builder.house.enums.ColorEnum;
import com.dojo.javapatterns.builder.house.enums.HouseStyleEnum;
import com.dojo.javapatterns.builder.house.enums.MaterialEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
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

}
