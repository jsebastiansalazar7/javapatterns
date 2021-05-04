package com.dojo.javapatterns.singleton.processors.multi_thread;

import com.dojo.javapatterns.singleton.processors.multi_thread.task_processors.DataTaskProcessor;
import com.dojo.javapatterns.singleton.processors.multi_thread.task_processors.LoginTaskProcessor;
import com.dojo.javapatterns.singleton.processors.multi_thread.task_processors.InfoTaskProcessor;
import com.dojo.javapatterns.singleton.processors.multi_thread.task_processors.TaskProcessor;

public class TaskOrchester {

    public static void main (String... args) {
        TaskProcessor infoTask = InfoTaskProcessor.builder()
                .name("Info task processor")
                .build();

        TaskProcessor loginTask = LoginTaskProcessor.builder()
                .name("Login task processor")
                .build();

        TaskProcessor dataTask = DataTaskProcessor.builder()
                .name("Data task processor")
                .build();

        infoTask.run();
        loginTask.run();
        dataTask.run();
        infoTask.run();
        loginTask.run();
        dataTask.run();

    }
}
