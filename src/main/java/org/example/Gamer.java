package org.example;

public class Gamer implements Observer{
    private String name;
    Gamer(String name) {
        this.name = name;
    }

    @Override
    public void update(Game game) {
        System.out.println("Gamer " + name + " received:");
        System.out.println("Name: " + game.getName());
        System.out.println("Achievements: ");
        for (var achievement: game.getAchievements()) {
            System.out.println(achievement);
        }
        System.out.println();
    }
}
