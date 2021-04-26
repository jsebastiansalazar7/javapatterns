package com.dojo.javapatterns.builder.phone.with_pattern;

import com.dojo.javapatterns.builder.phone.enums.NetworkTypeEnum;
import com.dojo.javapatterns.builder.phone.enums.ScreenTypeEnum;

import java.util.Arrays;
import java.util.List;

public class PhoneStore {

    public static void main(String... args) {
        System.out.println("*** Store opened! ***");
        System.out.println("Today I have 3 models with special discounts \n");

        SmartPhone phone1 = new SmartPhone.Builder()
                .withModel("iPhone X")
                .withBrand("Apple")
                .withYear(2018)
                .withRam(8)
                .withMemory(64)
                .withFrontCameraLenses(new int[]{7})
                .withRearCameraLenses(new int[]{12, 12})
                .withBattery(2716)
                .withScreenSize(5.8f)
                .withScreenType(ScreenTypeEnum.OLED)
                .withFingerPrintReader(true)
                .withFaceUnlocking(true)
                .withNetwork(NetworkTypeEnum.FORTH_GENERATION)
                .withPrice(949.00f)
                .build();

        SmartPhone phone2 = new SmartPhone.Builder()
                .withModel("Galaxy S8")
                .withBrand("Samsung")
                .withYear(2017)
                .withRam(4)
                .withMemory(64)
                .withFrontCameraLenses(new int[]{8, 2})
                .withRearCameraLenses(new int[]{12})
                .withBattery(3000)
                .withScreenSize(5.8f)
                .withScreenType(ScreenTypeEnum.SUPER_AMOLED)
                .withFingerPrintReader(true)
                .withFaceUnlocking(false)
                .withNetwork(NetworkTypeEnum.FORTH_GENERATION)
                .withPrice(899.99f)
                .build();

        SmartPhone phone3 = new SmartPhone.Builder()
                .withModel("Redmi 5 Plus")
                .withBrand("Xiaomi")
                .withYear(2017)
                .withRam(4)
                .withMemory(64)
                .withFrontCameraLenses(new int[]{5})
                .withRearCameraLenses(new int[]{12})
                .withBattery(4000)
                .withScreenSize(5.99f)
                .withScreenType(ScreenTypeEnum.IPS)
                .withFingerPrintReader(true)
                .withFaceUnlocking(false)
                .withNetwork(NetworkTypeEnum.FORTH_GENERATION)
                .withPrice(169.99f)
                .build();

        List<SmartPhone> phonesWithDiscount = Arrays.asList(phone1, phone2, phone3);

        phonesWithDiscount.forEach(phone -> System.out.println("- " + phone.toString() + "\n"));

    }

}
