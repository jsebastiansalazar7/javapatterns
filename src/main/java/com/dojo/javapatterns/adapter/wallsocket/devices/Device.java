package com.dojo.javapatterns.adapter.wallsocket.devices;

import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@AllArgsConstructor
@Data
public abstract class Device {
    private String name;
    private SocketTypeEnum socketType;
    private int[] volts;
    private int watts;

    public void plugDeviceIntoSocket(List<SocketTypeEnum> availableSocketTypes) {
        if (availableSocketTypes.contains(socketType)) {
            System.out.println("The " + name + " can be connected to the socket");
        } else {
            System.out.println("The " + name + " cannot be connected directly to the socket. " +
                    "A socket type " + availableSocketTypes.toString() + " adapter is required");
        }
    }
}
