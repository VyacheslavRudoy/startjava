package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] allNumbers = new int[10];

    public Player(String name) {
        if (name.isEmpty()) {
            name = "No name";
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, allNumbers.length);
    }

    public void setAllNumber(int index, int number) {
        allNumbers[index] = number;
    }

    public void fill( int secondIndex) {
        int firstIndex = 0;
        int number = 0;
        Arrays.fill(allNumbers, firstIndex, secondIndex, number);
    }
}