package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 101);
        int userNumber = 100;

        while (userNumber != random) {
            if (userNumber < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                userNumber++;
            } else if (userNumber > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
                if (userNumber % 2 == 0) {
                    userNumber /= 2;
                } else {
                    userNumber--;
                }
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}
