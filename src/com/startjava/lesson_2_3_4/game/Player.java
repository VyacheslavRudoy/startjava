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

    public int getAllNumber(int i) {
        int[] numbersCopy = Arrays.copyOf(allNumbers, allNumbers.length);
        if (numbersCopy[i] != 0) {
            return numbersCopy[i];
        }
        return 0;
    }

    public int[] getAllNumbers() {
        return Arrays.copyOf(allNumbers, allNumbers.length);
    }

    public void addAllNumber(int index, int number) {
        allNumbers[index] = number;
    }

    public void fill(int toIndex) {
        int firstIndex = 0;
        int number = 0;
        Arrays.fill(allNumbers, 0, toIndex, 0);
    }
}