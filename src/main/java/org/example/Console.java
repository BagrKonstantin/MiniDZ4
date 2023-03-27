package org.example;

import java.util.ArrayList;
import java.util.List;

public class Console implements Observable{
    private List<Observer> subscribers;
    private List<Game> games;

    Console() {
        subscribers = new ArrayList<>();
        games = new ArrayList<>();
    }

    public void addNewGame(Game game) {
        games.add(game);
        notifyObservers(game);
    }


    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void notifyObservers(Game game) {
        for (Observer observer: subscribers) {
            observer.update(game);
        }
    }
}
