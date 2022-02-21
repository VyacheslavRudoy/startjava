package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private boolean isPlayerWin;

    public GuessNumber(String nameOne, String nameTwo) {
        player1 = new Player(nameOne);
        player2 = new Player(nameTwo);
    }

    public void start() {
        int randomNumber = (int) (Math.random() * 101);
        int i;

        System.out.println("У каждого игрока есть 10 попыток");
        for (i = 0; i < 10; i++) {
            gameProcess(player1, randomNumber, i);
            gameProcess(player2, randomNumber, i);
        }

        endOfGameProcess(player1, i);
        endOfGameProcess(player2, i);
    }

    public void gameProcess(Player player, int randomNumber, int i) {
        Scanner scanner = new Scanner(System.in);

        if (!isPlayerWin) {
            System.out.println("Игрок " + player.getName() + ", ваш ход:");
            int user1Number = scanner.nextInt();
            player.setAllNumber(i, user1Number);

            if (player.getAllNumbers()[i] < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player.getAllNumbers()[i] > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player.getAllNumbers()[i] == randomNumber) {
                System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (i += 1) + " попытки");
                isPlayerWin = true;
            }

            if (i == 9) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
        }
    }

    public void endOfGameProcess(Player player, int secondIndex) {
            if (player.getAllNumbers().length == 10 && player.getAllNumbers()[9] != 0) {
                System.out.print("Числа, которые назвал " + player.getName() + " : ");

                for (int allNumber : player.getAllNumbers()) {
                    System.out.print(allNumber + " ");
                }
                System.out.println("");
            }
        player.fill(secondIndex);
    }
}