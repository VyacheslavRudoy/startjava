package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(String nameOne, String nameTwo) {
        player1 = new Player(nameOne);
        player2 = new Player(nameTwo);
    }

    public void start() {
        int randomNumber = (int) (Math.random() * 101);
        int user1Number = 0;
        int user2Number = 0;
        int i;

        System.out.println("У каждого игрока есть 10 попыток");
        for (i = 0; i < 10; i++) {
            System.out.println("Игрок " + player1 + ", ваш ход:");
            Scanner scanner = new Scanner(System.in);
            user1Number = scanner.nextInt();
            player1.allNumbers[i] = user1Number;
            if (player1.allNumbers[i] < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player1.allNumbers[i] > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player1.allNumbers[i] == randomNumber) {
                i += 1;
                System.out.println("Игрок " + player1 + " угадал число " + randomNumber + " с " + i + " попытки");
                break;
            }
            if (i == 9) {
                System.out.println("У " + player1 + " закончились попытки");
            }

            System.out.println("Игрок " + player2 + ", ваш ход:");
            user2Number = scanner.nextInt();
            player2.allNumbers[i] = user2Number;
            if (player2.allNumbers[i] < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (player2.allNumbers[i] > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player2.allNumbers[i] == randomNumber) {
                i += 1;
                System.out.println("Игрок " + player2 + " угадал число " + randomNumber + " с " + i + " попытки");
                break;
            }
            if (i == 9) {
                System.out.println("У " + player2 + " закончились попытки");
            }
        }
        if (player1.allNumbers.length == 10) {
            System.out.println("Числа, названные игроком 1: " + Arrays.toString(Arrays.copyOf(player1.allNumbers, player1.allNumbers.length)));
        }
        if (player2.allNumbers.length == 10) {
            System.out.println("Числа, названные игроком 2: " + Arrays.toString(Arrays.copyOf(player2.allNumbers, player2.allNumbers.length)));
        }

        Arrays.fill(player1.allNumbers,0, i, 0);
        Arrays.fill(player1.allNumbers,0, i, 0);
    }
}
