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
            if (!isPlayerWin) {
                startGameplay(player1, randomNumber, i);
            }
            if (!isPlayerWin) {
                startGameplay(player2, randomNumber, i);
            } else if (isPlayerWin) {
                break;
            }
        }

        endOfGameProcess(player1);
        endOfGameProcess(player2);

        remove(player1, i);
        remove(player2, i);
    }

    public void startGameplay(Player player, int randomNumber, int i) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игрок " + player.getName() + ", ваш ход:");
        int playerNumber = scanner.nextInt();
        player.addAllNumber(i, playerNumber);

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
        }
    }

    public void endOfGameProcess(Player player) {
        if (player.getAllNumber(9) != 0) {
            enumerationOfNumbers(player);
        }
    }

    public void enumerationOfNumbers(Player player) {
        System.out.print("Числа, которые назвал " + player.getName() + " : ");

        for (int allNumber : player.getAllNumbers()) {
            System.out.print(allNumber + " ");
        }
        System.out.println("");
    }

    public void remove(Player player, int toIndex) {
        player.fill(toIndex);
    }
}