package com.dojo.javapatterns.adapter.wallsocket.devices;

import com.dojo.javapatterns.adapter.wallsocket.devices.Device;
import com.dojo.javapatterns.adapter.wallsocket.enums.FrequencyTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.VoltageTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.sockets.SocketSouthKorea;
import com.dojo.javapatterns.adapter.wallsocket.sockets.SocketUS;
import com.dojo.javapatterns.adapter.wallsocket.sockets.SocketUtils;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Arrays;
import java.util.List;

@SuperBuilder
public class MacbookPro extends Device implements SocketUS {

    MacbookPro(String name, SocketTypeEnum socketType, int[] volts, int watts) {
        super(name, socketType, volts, watts);
    }

    @Override
    public void connectDeviceToUSSocket() {
        System.out.println("Trying to connect device to US socket");
        plugDeviceIntoSocket(getAvailableSockets());
    }

    @Override
    public List<SocketTypeEnum> getAvailableSockets() {
        return Arrays.asList(SocketTypeEnum.A, SocketTypeEnum.B);
    }

    @Override
    public VoltageTypeEnum getVoltageLevel() {
        return VoltageTypeEnum.LOW_VOLTAGE;
    }

    @Override
    public FrequencyTypeEnum getFrequency() {
        return FrequencyTypeEnum.HIGH;
    }

    @Override
    public void provideEnergy() {
        System.out.println("The socket is going to start providing energy to a Macbook Pro");
        SocketUtils.provideEnergy(this, getVoltageLevel(), getFrequency());
    }

}
