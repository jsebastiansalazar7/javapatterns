package com.dojo.javapatterns.adapter.wallsocket.sockets;

import com.dojo.javapatterns.adapter.wallsocket.enums.FrequencyTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.SocketTypeEnum;
import com.dojo.javapatterns.adapter.wallsocket.enums.VoltageTypeEnum;

import java.util.List;

public interface Socket {

    List<SocketTypeEnum> getAvailableSockets();

    VoltageTypeEnum getVoltageLevel();

    FrequencyTypeEnum getFrequency();

    void provideEnergy();

}
