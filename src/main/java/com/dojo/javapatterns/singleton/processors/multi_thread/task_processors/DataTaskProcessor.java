package com.dojo.javapatterns.singleton.processors.multi_thread.task_processors;

import com.dojo.javapatterns.singleton.processors.enums.ApiEnum;
import com.dojo.javapatterns.singleton.processors.ApiConnectionManager;
import com.dojo.javapatterns.singleton.processors.Logger;
import com.dojo.javapatterns.singleton.processors.multi_thread.TaskProcessorUtils;
import lombok.experimental.SuperBuilder;

import java.util.Optional;

@SuperBuilder
public class DataTaskProcessor extends TaskProcessor {

    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        ApiConnectionManager connectionManager = TaskProcessorUtils.getConnection();
        TaskProcessorUtils.setConnectionInfo(connectionManager, ApiEnum.DATA);

        logger.subtitle("Getting data from the API");
        TaskProcessorUtils.simulateProcessingTime(5000L);
        Optional<String> response = connectionManager.makeRequest();
        response.ifPresent(res -> {
            logger.log("Response: " + res);
        });
    }
}
