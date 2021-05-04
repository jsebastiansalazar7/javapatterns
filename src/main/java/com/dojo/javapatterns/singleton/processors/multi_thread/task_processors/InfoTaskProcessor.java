package com.dojo.javapatterns.singleton.processors.multi_thread.task_processors;

import com.dojo.javapatterns.singleton.processors.Logger;
import com.dojo.javapatterns.singleton.processors.enums.ApiEnum;
import com.dojo.javapatterns.singleton.processors.multi_thread.TaskProcessorUtils;
import com.dojo.javapatterns.singleton.processors.ApiConnectionManager;
import lombok.experimental.SuperBuilder;

import java.util.Optional;

@SuperBuilder
public class InfoTaskProcessor extends TaskProcessor {

    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        ApiConnectionManager connectionManager = TaskProcessorUtils.getConnection();
        TaskProcessorUtils.setConnectionInfo(connectionManager, ApiEnum.INFO);

        logger.subtitle("Getting info from the API");
        TaskProcessorUtils.simulateProcessingTime(2000L);
        Optional<String> response = connectionManager.makeRequest();
        response.ifPresent(res -> {
            logger.log("Response: " + res);
        });
    }
}
