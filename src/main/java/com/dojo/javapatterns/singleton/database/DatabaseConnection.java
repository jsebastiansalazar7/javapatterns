package com.dojo.javapatterns.singleton.database;

import com.dojo.javapatterns.singleton.database.enums.DatabaseDriverEnum;

public class DatabaseConnection {

    public static void main(String[] args) {
        System.out.println("Instantiating database connection for the first time:");
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance(DatabaseDriverEnum.ORACLE);
        dbManager.doConnection();

        System.out.println("\nAttempting to create new instance of POSTGRES database:");
        DatabaseConnectionManager newDbManager = DatabaseConnectionManager.getInstance(DatabaseDriverEnum.POSTGRES);
        newDbManager.doConnection();

        System.out.println("\nComparing two instances to see if Singleton is working:");
        if (newDbManager.getDatabaseDriverEnum() != dbManager.getDatabaseDriverEnum()) {
            System.out.println("DB Drivers are not equal. Singleton is broken.");
        } else if (newDbManager.getDatabaseDriverEnum() == dbManager.getDatabaseDriverEnum()) {
            System.out.println("DB Drivers are equal. Singleton is working.");
        }
    }
}
