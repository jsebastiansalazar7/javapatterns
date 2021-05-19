package com.dojo.javapatterns.adapter.wallsocket.adapters;

import com.dojo.javapatterns.adapter.wallsocket.devices.Device;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;

import java.util.Collections;

public class SocketAdapterCToA extends Device implements SocketAdapter {

    private static final SocketTypeEnum outputSocketType;
    private static final SocketTypeEnum inputSocketType;

    static {
        outputSocketType = SocketTypeEnum.A;
        inputSocketType = SocketTypeEnum.C;
    }

    public SocketAdapterCToA(String name) {
        super(name, outputSocketType, new int[] {}, 0);
    }

    @Override
    public void connectDevice(Device device) {
        connectAdapterToSocket();
        connectDeviceToAdapter(device);
    }

    private void connectAdapterToSocket() {
        System.out.println("* Connected adapter from type C to type A to the socket");
        this.plugDeviceIntoSocket(Collections.singletonList(this.getSocketType()));
    }

    private void connectDeviceToAdapter(Device device) {
        device.plugDeviceIntoSocket(Collections.singletonList(device.getSocketType()));
        System.out.println("The connection was made through an adapter");
    }

    private SocketTypeEnum getOutputSocketType() {
        return outputSocketType;
    }

    private SocketTypeEnum getInputSocketType() {
        return inputSocketType;
    }

}
