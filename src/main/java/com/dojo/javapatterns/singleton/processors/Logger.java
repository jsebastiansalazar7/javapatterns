package com.dojo.javapatterns.singleton.processors;

import lombok.Data;

@Data
public class Logger {

    private static Logger INSTANCE;
    private String info;

    private Logger() {

    }

    public static Logger getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void log(String log) {
        System.out.println(log);
    }

    public void title(String title) {
        System.out.println("*** " + title + " ***\n");
    }

    public void subtitle(String subtitle) {
        System.out.println("\n* " + subtitle);
    }

}
