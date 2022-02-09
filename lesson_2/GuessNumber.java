import java.util.Scanner;

public class GuessNumber {

    public static int guess() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public static void game(Player player1, Player player2) {
        int random = (int) (Math.random() * 101);
        int user1Number = 0;
        int user2Number = 0;

        while (!(user1Number == random || user2Number == random)) {
            System.out.println("Игрок " + player1 + ", ваш ход:");
            user1Number = GuessNumber.guess();
            if (user1Number < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user1Number > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user1Number == random) {
                System.out.println("Поздравляю, " + player1 + " угадал число!");
                GuessNumber.nextGame(player1, player2);
            }

            System.out.println("Игрок " + player2 + ", ваш ход:");
            user2Number = GuessNumber.guess();
            if (user2Number < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user2Number > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user2Number == random) {
                System.out.println("Поздравляю, " + player2 + " угадал число!");
                GuessNumber.nextGame(player1, player2);
            }
        }
    }

    public static void nextGame(Player player1, Player player2) {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        Scanner scanner = new Scanner(System.in);
        String nextRound = scanner.nextLine();
        if (nextRound.equals("yes")) {
            GuessNumber.game(player1, player2);
        } else if (nextRound.equals("no")) {
            System.exit(0);
        } else {
            while (!(nextRound.equals("yes") || nextRound.equals("no"))) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                nextRound = scanner.nextLine();
                if (nextRound.equals("yes")) {
                    GuessNumber.game(player1, player2);
                } else if (nextRound.equals("no")) {
                    System.exit(0);
                }
            }
        }
    }
}


