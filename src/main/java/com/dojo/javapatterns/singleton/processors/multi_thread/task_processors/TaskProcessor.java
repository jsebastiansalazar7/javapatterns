package com.dojo.javapatterns.singleton.processors.multi_thread.task_processors;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public abstract class TaskProcessor implements Runnable {
    String name;
}
