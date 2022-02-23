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
        for (i = 0; ((i < 10) && !isPlayerWin); i++) {
            if (!isPlayerWin) {
                startGameplay(player1, randomNumber, i);
            }
            if (!isPlayerWin) {
                startGameplay(player2, randomNumber, i);
            }
        }
        clearNumbers(i);
    }

    public void startGameplay(Player player, int randomNumber, int i) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игрок " + player.getName() + ", ваш ход:");
        int playerNumber = scanner.nextInt();
        player.addNumber(i, playerNumber);

        if (playerNumber < randomNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (playerNumber > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (playerNumber == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + (i += 1) + " попытки");
            isPlayerWin = true;
        }

        if (i == 9) {
            System.out.println("У " + player.getName() + " закончились попытки");
            showEnteredNumbers(player);
        }
    }

    public void showEnteredNumbers(Player player) {
        System.out.print("Числа, которые назвал " + player.getName() + " : ");

        for (int number : player.getAllNumbers(10)) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public void clearNumbers(int i) {
        player1.fill(i);
        player2.fill(i);
    }
}