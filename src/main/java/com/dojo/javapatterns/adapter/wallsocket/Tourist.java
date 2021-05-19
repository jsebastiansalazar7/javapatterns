package com.dojo.javapatterns.adapter.wallsocket;

import com.dojo.javapatterns.adapter.wallsocket.adapters.SocketAdapter;
import com.dojo.javapatterns.adapter.wallsocket.adapters.SocketAdapterAToC;
import com.dojo.javapatterns.adapter.wallsocket.adapters.SocketAdapterCToA;
import com.dojo.javapatterns.adapter.wallsocket.devices.MacbookPro;
import com.dojo.javapatterns.adapter.wallsocket.devices.SamsungChromebook;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;

import java.util.Arrays;

public class Tourist {

    public static void main(String... args) {
        System.out.println("*** A tourist has arrived to the room of a hotel and will connect his electronic devices ***");

        MacbookPro macbookPro = MacbookPro.builder()
                .name("Macbook Pro 2016 13\"")
                .socketType(SocketTypeEnum.A)
                .volts(new int[] {110, 220})
                .watts(35)
                .build();

        SamsungChromebook samsungChromebook = SamsungChromebook.builder()
                .name("Samsung Chromebook 4 15.6\"")
                .socketType(SocketTypeEnum.C)
                .volts(new int[] {220})
                .watts(45)
                .build();

        System.out.println("\nThe tourist devices are: ");
        System.out.println("* " + macbookPro.toString());
        System.out.println("* " + samsungChromebook.toString());

        System.out.println("\n- The tourist will try to connect to the right socket type");
        macbookPro.connectDeviceToUSSocket();
        samsungChromebook.connectDeviceToKoreaSocket();

        System.out.println("\n- The tourist will try to connect to a different socket type");
        macbookPro.plugDeviceIntoSocket(Arrays.asList(SocketTypeEnum.C));
        samsungChromebook.plugDeviceIntoSocket(Arrays.asList(SocketTypeEnum.A));

        System.out.println("\n- The tourist will use an adapter to connect the devices to different socket types");
        SocketAdapter adapterTypeAToC = new SocketAdapterAToC("Adapter from type A to type C");
        adapterTypeAToC.connectDevice(macbookPro);

        SocketAdapter adapterTypeCToA = new SocketAdapterCToA("Adapter from type C to type A");
        adapterTypeCToA.connectDevice(samsungChromebook);
    }
}
