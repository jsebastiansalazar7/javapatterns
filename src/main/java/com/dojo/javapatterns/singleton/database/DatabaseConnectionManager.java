package com.dojo.javapatterns.singleton.database;

import com.dojo.javapatterns.singleton.database.enums.DatabaseDriverEnum;
import lombok.Data;

@Data
public class DatabaseConnectionManager {

    public static DatabaseConnectionManager INSTANCE;
    private DatabaseDriverEnum databaseDriverEnum;

    private DatabaseConnectionManager() {

    }

    private DatabaseConnectionManager(DatabaseDriverEnum databaseDriverEnum) {
        this.databaseDriverEnum = databaseDriverEnum;
    }

    public static DatabaseConnectionManager getInstance(DatabaseDriverEnum databaseDriverEnum) {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnectionManager(databaseDriverEnum);
        }
        return INSTANCE;
    }

    public boolean doConnection() {
        System.out.println("Attempting connection...");
        switch (databaseDriverEnum) {
            case ORACLE:
                System.out.println("> Connected to Oracle.");
                return true;
            case MYSQL:
                System.out.println("> Connected to MySQL");
                return true;
            case POSTGRES:
                System.out.println("> Connected to Postgres");
                return true;
            default:
                System.out.println("> Not connected to any database.");
                return false;
        }
    }

}
