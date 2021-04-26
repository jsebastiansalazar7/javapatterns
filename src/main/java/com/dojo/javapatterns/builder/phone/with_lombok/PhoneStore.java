package com.dojo.javapatterns.builder.phone.with_lombok;

import com.dojo.javapatterns.builder.phone.enums.NetworkTypeEnum;
import com.dojo.javapatterns.builder.phone.enums.ScreenTypeEnum;


import java.util.Arrays;
import java.util.List;

public class PhoneStore {

    public static void main(String... args) {
        System.out.println("*** Store opened! ***");
        System.out.println("Today I have 3 models with special discounts \n");

        SmartPhone phone1 = new SmartPhone.SmartPhoneBuilder()
                .model("iPhone X")
                .brand("Apple")
                .year(2018)
                .ram(8)
                .memory(64)
                .frontCameraLenses(new int[]{7})
                .rearCameraLenses(new int[]{12, 12})
                .battery(2716)
                .screenSize(5.8f)
                .screenType(ScreenTypeEnum.OLED)
                .hasFingerPrintReader(true)
                .hasFaceUnlocking(true)
                .network(NetworkTypeEnum.FORTH_GENERATION)
                .price(949.00f)
                .build();

        SmartPhone phone2 = new SmartPhone.SmartPhoneBuilder()
                .model("Galaxy S8")
                .brand("Samsung")
                .year(2017)
                .ram(4)
                .memory(64)
                .frontCameraLenses(new int[]{8, 2})
                .rearCameraLenses(new int[]{12})
                .battery(3000)
                .screenSize(5.8f)
                .screenType(ScreenTypeEnum.SUPER_AMOLED)
                .hasFingerPrintReader(true)
                .hasFaceUnlocking(false)
                .network(NetworkTypeEnum.FORTH_GENERATION)
                .price(899.99f)
                .build();

        SmartPhone phone3 = new SmartPhone.SmartPhoneBuilder()
                .model("Redmi 5 Plus")
                .brand("Xiaomi")
                .year(2017)
                .ram(4)
                .memory(64)
                .frontCameraLenses(new int[]{5})
                .rearCameraLenses(new int[]{12})
                .battery(4000)
                .screenSize(5.99f)
                .screenType(ScreenTypeEnum.IPS)
                .hasFingerPrintReader(true)
                .hasFaceUnlocking(false)
                .network(NetworkTypeEnum.FORTH_GENERATION)
                .price(169.99f)
                .build();

        List<SmartPhone> phonesWithDiscount = Arrays.asList(phone1, phone2, phone3);

        phonesWithDiscount.forEach(phone -> System.out.println("- " + phone.toString() + "\n"));

    }

}
