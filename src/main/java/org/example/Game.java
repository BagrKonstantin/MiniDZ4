package org.example;

import java.util.List;

public class Game {
    private String name;
    private List<String> achievements;

    private String shortInfo;

    private String techData;

    public Game(String name, List<String> achievements, String shortInfo, String techData) {
        this.name = name;
        this.achievements = achievements;
        this.shortInfo = shortInfo;
        this.techData = techData;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public String getName() {
        return name;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public String getTechData() {
        return techData;
    }
}
