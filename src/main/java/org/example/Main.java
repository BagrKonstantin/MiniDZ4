package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.subscribe(new Gamer("Vitya"));
        console.subscribe(new Developer("Igor Melnikov"));
        console.subscribe(new Journalist("Sad clown"));
        Game game = new Game(
                "The USSR skylines",
                new ArrayList<>() {{
                    add("Launch game");
                    add("Close game");
                }},
                "Very cool game about USSR",
                "Only for linux"
        );
        console.addNewGame(game);

    }
}