package com.dojo.javapatterns.singleton.processors.single_thread;

import com.dojo.javapatterns.singleton.processors.Logger;
import com.dojo.javapatterns.singleton.processors.enums.ApiEnum;
import com.dojo.javapatterns.singleton.processors.ApiConnectionManager;

import java.util.Optional;
import java.util.UUID;

public class SingleProcessor {

    public static void main(String... args) {
        Logger logger = Logger.getInstance();
        ApiConnectionManager connectionManager = getConnection();
        logger.title("The data retrieving process has started");

        logger.subtitle("Getting info from the API");
        Optional<String> response = connectionManager.makeRequest();
        response.ifPresent(res -> {
            logger.log("Response: " + res);
        });

        logger.subtitle("Attempting to log in");
        ApiConnectionManager loginConnectionManager = getLoginConnection();
        response = loginConnectionManager.makeRequest();
        response.ifPresent(res -> {
            logger.log("Response: " + res);
        });

        logger.subtitle("Getting info from the API again");
        response = connectionManager.makeRequest();
        response.ifPresent(res -> {
            logger.log("Response: " + res);
        });
    }

    private static ApiConnectionManager getConnection() {
        ApiConnectionManager connectionManager = ApiConnectionManager.getInstance();
        connectionManager.setToken(UUID.randomUUID().toString());
        return connectionManager;
    }

    private static ApiConnectionManager getLoginConnection() {
        ApiConnectionManager connectionManager = ApiConnectionManager.getInstance();
        connectionManager.setEndpoint(ApiEnum.LOGIN.getEndpoint());
        connectionManager.setToken(UUID.randomUUID().toString());
        return connectionManager;
    }
}
