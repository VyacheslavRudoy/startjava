import java.util.Scanner;

public class GuessNumber {

    public static void game() {
        int random = (int) (Math.random() * 101);
        int move = 1;

        while (true) {
            while (move == 1) {
                System.out.println("Игрок " + Player.player1.getName() + ", ваш ход:");
                int user1Number = Player.guess();
                if (user1Number < random) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else if (user1Number > random) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (user1Number == random) {
                    System.out.println("Поздравляю, " + Player.player1.getName() + " угадал число!");
                    move++;
                }
                move++;
            }

            while (move == 2) {
                System.out.println("Игрок " + Player.player2 + ", ваш ход:");
                int user2Number = Player.guess();
                if (user2Number < random) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else if (user2Number > random) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (user2Number == random) {
                    System.out.println("Поздравляю, " + Player.player2.getName() + " угадал число!");
                    move--;
                }
                move--;
            }

            if (move == 3 || move == 0) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                Scanner scanner = new Scanner(System.in);
                String nextRound = scanner.nextLine();
                if (nextRound.equals("yes")) {
                    GuessNumber.game();
                    move = 1;
                } else if (nextRound.equals("no")) {
                    System.exit(0);
                } else {
                    while (!(nextRound.equals("yes") || nextRound.equals("no"))) {
                        System.out.println("Хотите продолжить игру? [yes/no]:");
                        Scanner scanner1 = new Scanner(System.in);
                        nextRound = scanner1.nextLine();
                        if (nextRound.equals("yes")) {
                            GuessNumber.game();
                            move = 1;
                        } else if (nextRound.equals("no")) {
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }
}


