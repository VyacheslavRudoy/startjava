import java.util.Scanner;

public class GuessNumber {

    public static int guess() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public void start(Player player1, Player player2) {
        int random = (int) (Math.random() * 101);
        int user1Number = 0;
        int user2Number = 0;

        while (true) {
            System.out.println("Игрок " + player1 + ", ваш ход:");
            user1Number = GuessNumber.guess();
            if (user1Number < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user1Number > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user1Number == random) {
                System.out.println("Поздравляю, " + player1 + " угадал число!");
                break;
            }


            System.out.println("Игрок " + player2 + ", ваш ход:");
            user2Number = GuessNumber.guess();
            if (user2Number < random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (user2Number > random) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (user2Number == random) {
                System.out.println("Поздравляю, " + player2 + " угадал число!");
                break;
            }
        }
    }
}





