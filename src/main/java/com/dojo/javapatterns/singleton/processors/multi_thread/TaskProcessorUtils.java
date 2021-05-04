package com.dojo.javapatterns.singleton.processors.multi_thread;

import com.dojo.javapatterns.singleton.processors.enums.ApiEnum;
import com.dojo.javapatterns.singleton.processors.ApiConnectionManager;

import java.util.UUID;

public class TaskProcessorUtils {

    public static ApiConnectionManager getConnection() {
        ApiConnectionManager connectionManager = ApiConnectionManager.getInstance();
        connectionManager.setToken(UUID.randomUUID().toString());
        return connectionManager;
    }

    public static void setConnectionInfo(ApiConnectionManager connectionManager, ApiEnum api) {
        connectionManager.setEndpoint(api.getEndpoint());
        connectionManager.setToken(UUID.randomUUID().toString());
    }

    public static void simulateProcessingTime(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
