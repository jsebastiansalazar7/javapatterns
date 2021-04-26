package com.dojo.javapatterns.builder.phone.without_pattern;

import com.dojo.javapatterns.builder.phone.enums.NetworkTypeEnum;
import com.dojo.javapatterns.builder.phone.enums.ScreenTypeEnum;

import java.util.Arrays;
import java.util.List;

public class PhoneStore {

    public static void main(String... args) {
        System.out.println("*** Store opened! ***");
        System.out.println("Today I have 3 models with special discounts \n");

        SmartPhone phone1 = new SmartPhone("iPhone X", "Apple", 2018, 8, 64,
                new int[]{7}, new int[]{12, 12}, 2716, 5.8f, ScreenTypeEnum.OLED,
                true, true, NetworkTypeEnum.FORTH_GENERATION, 949.00f);

        SmartPhone phone2 = new SmartPhone("Galaxy S8", "Samsung", 2017, 4, 64,
                new int[]{8, 2}, new int[]{12}, 3000, 5.8f, ScreenTypeEnum.SUPER_AMOLED,
                true, false, NetworkTypeEnum.FORTH_GENERATION, 899.99f);

        SmartPhone phone3 = new SmartPhone("Redmi 5 Plus", "Xiaomi", 2017, 4, 64,
                new int[]{5}, new int[]{12}, 4000, 5.99f, ScreenTypeEnum.IPS,
                true, false, NetworkTypeEnum.FORTH_GENERATION, 169.99f);

        List<SmartPhone> phonesWithDiscount = Arrays.asList(phone1, phone2, phone3);

        phonesWithDiscount.forEach(phone -> System.out.println("- " + phone.toString() + "\n"));
    }

}
