import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя игрока 1:");
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();

        System.out.println("Введите имя игрока 2:");
        String nameTwo = scanner.nextLine();

        String nextRound = "yes";
        do {
            if ("yes".equals(nextRound)) {
                GuessNumber game = new GuessNumber(nameOne, nameTwo);
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            nextRound = scanner.nextLine();
        } while (!nextRound.equals("no"));
    }
}
