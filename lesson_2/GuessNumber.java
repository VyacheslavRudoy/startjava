import java.util.Scanner;

public class GuessNumber {

    public GuessNumber(Player player1, Player player2) {
    }

    public void start(Player player1, Player player2) {
        int randomNumber = (int) (Math.random() * 101);
        int user1Number = 0;
        int user2Number = 0;

        while (true) {
            System.out.println("Игрок " + player1 + ", ваш ход:");
            Scanner scanner = new Scanner(System.in);
            user1Number = scanner.nextInt();
            if (user1Number < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user1Number > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user1Number == randomNumber) {
                System.out.println("Поздравляю, " + player1 + " угадал число!");
                break;
            }

            System.out.println("Игрок " + player2 + ", ваш ход:");
            user2Number = scanner.nextInt();
            if (user2Number < randomNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user2Number > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user2Number == randomNumber) {
                System.out.println("Поздравляю, " + player2 + " угадал число!");
                break;
            }
        }
    }
}
