package org.example;

public class Journalist implements Observer{

    String name;
    Journalist(String name) {
        this.name = name;
    }

    @Override
    public void update(Game game) {
        System.out.println("Journalist " + name + " received:");
        System.out.println("Short information: " + game.getShortInfo() + '\n');
    }
}
