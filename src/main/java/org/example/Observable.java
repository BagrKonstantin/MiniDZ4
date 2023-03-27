package org.example;

public interface Observable {
    void subscribe(Observer observer);

    void notifyObservers(Game game);
}
