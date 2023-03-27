package org.example;

public class Developer implements Observer{
    String name;
    Developer(String name) {
        this.name = name;
    }
    @Override
    public void update(Game game) {
        System.out.println("Developer " + name + " received:");
        System.out.println("Tech data: " + game.getTechData() + '\n');
    }
}
