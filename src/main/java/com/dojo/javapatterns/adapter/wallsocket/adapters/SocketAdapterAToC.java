package com.dojo.javapatterns.adapter.wallsocket.adapters;

import com.dojo.javapatterns.adapter.wallsocket.devices.Device;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;

import java.util.Collections;

public class SocketAdapterAToC extends Device implements SocketAdapter {

    private static final SocketTypeEnum outputSocketType;
    private static final SocketTypeEnum inputSocketType;

    static {
        outputSocketType = SocketTypeEnum.C;
        inputSocketType = SocketTypeEnum.A;
    }

    public SocketAdapterAToC(String name) {
        super(name, outputSocketType, new int[] {}, 0);
    }

    @Override
    public void connectDevice(Device device) {
        connectAdapterToSocket();
        connectDeviceToAdapter(device);
    }

    private void connectAdapterToSocket() {
        System.out.println("* Connected adapter from type A to type C to the socket");
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
