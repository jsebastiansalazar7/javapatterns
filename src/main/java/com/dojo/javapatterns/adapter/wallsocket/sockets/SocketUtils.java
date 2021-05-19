package com.dojo.javapatterns.adapter.wallsocket.sockets;

import com.dojo.javapatterns.adapter.wallsocket.devices.Device;
import com.dojo.javapatterns.adapter.wallsocket.enums.FrequencyTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.VoltageTypeEnum;

import java.util.Arrays;

public class SocketUtils {

    public static void provideEnergy(Device device, VoltageTypeEnum voltageType, FrequencyTypeEnum frequency) {
        System.out.println("Providing energy at " + Arrays.toString(voltageType.getVoltageLevels()) + "V " +
                frequency.getFrequency() + "Hz");

        int[] availableVoltageLevels = voltageType.getVoltageLevels();
        int lowestVoltageSocket = availableVoltageLevels[0];
        int highestVoltageSocket = availableVoltageLevels[availableVoltageLevels.length - 1];

        int[] deviceVoltageLevels = device.getVolts();
        int lowestVoltageDevice = deviceVoltageLevels[0];
        int hightestVoltageDevice = deviceVoltageLevels.length == 2 ? deviceVoltageLevels[1] : lowestVoltageDevice;

        if (lowestVoltageDevice >= lowestVoltageSocket && lowestVoltageDevice <= highestVoltageSocket) {
            System.out.println("The " + device.getName() + " is getting energy safely");
        } else if (lowestVoltageDevice > highestVoltageSocket) {
            System.out.println("The " + device.getName() + " demands more energy than the socket can provide.  " +
                    "Breakers will be triggered");
        } else if (hightestVoltageDevice < lowestVoltageSocket) {
            System.out.println("The " + device.getName() + " requires lower voltage, so it is going to burn :(");
        }
    }
}
