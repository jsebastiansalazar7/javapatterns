package com.dojo.javapatterns.adapter.wallsocket.devices;

import com.dojo.javapatterns.adapter.wallsocket.devices.Device;
import com.dojo.javapatterns.adapter.wallsocket.enums.FrequencyTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.VoltageTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.sockets.SocketSouthKorea;
import com.dojo.javapatterns.adapter.wallsocket.sockets.SocketUtils;
import lombok.experimental.SuperBuilder;

import java.util.Arrays;
import java.util.List;

@SuperBuilder
public class SamsungChromebook extends Device implements SocketSouthKorea {

    SamsungChromebook(String name, SocketTypeEnum socketType, int[] volts, int watts) {
        super(name, socketType, volts, watts);
    }

    @Override
    public void connectDeviceToKoreaSocket() {
        System.out.println("Trying to connect device to a South Korean socket");
        plugDeviceIntoSocket(getAvailableSockets());
    }

    @Override
    public List<SocketTypeEnum> getAvailableSockets() {
        return Arrays.asList(SocketTypeEnum.C, SocketTypeEnum.F);
    }

    @Override
    public VoltageTypeEnum getVoltageLevel() {
        return VoltageTypeEnum.HIGH_VOLTAGE;
    }

    @Override
    public FrequencyTypeEnum getFrequency() {
        return FrequencyTypeEnum.HIGH;
    }

    @Override
    public void provideEnergy() {
        System.out.println("The socket is going to start providing energy to a Samsung Chromebook");
        SocketUtils.provideEnergy(this, getVoltageLevel(), getFrequency());
    }

}
