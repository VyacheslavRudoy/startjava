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

    public int[] getAllNumbers(int index) {
        return Arrays.copyOf(allNumbers, index);
    }

    public void addNumber(int index, int number) {
        allNumbers[index] = number;
    }

    public void fill(int toIndex) {
        Arrays.fill(allNumbers, 0, toIndex, 0);
    }
}