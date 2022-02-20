package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    boolean isPlayerWin;

    public GuessNumber(String nameOne, String nameTwo) {
        player1 = new Player(nameOne);
        player2 = new Player(nameTwo);
    }

    public void start() {
        int randomNumber = (int) (Math.random() * 101);
        int i;

        System.out.println("У каждого игрока есть 10 попыток");
        for (i = 0; i < 10; i++) {
            mainLogic(player1, randomNumber, i);
            mainLogic(player2, randomNumber, i);
        }

        overing(player1);
        overing(player2);
    }

    public void mainLogic(Player player, int randomNumber, int i) {
        Scanner scanner = new Scanner(System.in);

        if (isPlayerWin == false) {
            System.out.println("Игрок " + player.getName() + ", ваш ход:");
            int user1Number = scanner.nextInt();
            player.setAllNumbers(i, user1Number);

            if (player.getAllNumbers()[i] < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player.getAllNumbers()[i] > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player.getAllNumbers()[i] == randomNumber) {
                i += 1;
                System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + i + " попытки");
                isPlayerWin = true;
            }

            if (i == 9) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
        }
    }

    public void overing(Player player) {
        boolean allNumbers = false;
            if (player.getAllNumbers().length == 10 && player.getAllNumbers()[9] != 0) {
                allNumbers = true;
            }

        if (allNumbers == true) {
            System.out.println("Числа, которые назвал " + player.getName() + " :" + Arrays.toString(Arrays.copyOf(player.getAllNumbers(), player.getAllNumbers().length)));
            player.fill(0);
        }
    }
}


