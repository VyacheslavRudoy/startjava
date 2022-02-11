import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя игрока 1:");
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();

        System.out.println("Введите имя игрока 2:");
        String nameTwo = scanner.nextLine();

        String nextRound = "";
        while (!nextRound.equals("no")) {
            GuessNumber game = new GuessNumber(nameOne, nameTwo);
            game.start();
            nextRound = "";

            while (!(nextRound.equals("no") || nextRound.equals("yes"))) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                nextRound = scanner.nextLine();
            }
        }
    }
}
