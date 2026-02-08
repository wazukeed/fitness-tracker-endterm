package org.example.fitnesstracker.patterns.singleton;

public class AppConfig {

    private static AppConfig instance;

    private AppConfig() {
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return "Fitness Tracker API";
    }
}

