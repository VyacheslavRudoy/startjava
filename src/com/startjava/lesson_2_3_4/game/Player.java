package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;

    public Player(String name) {
        if (name.isEmpty()) {
            name = "No name";
        }
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
