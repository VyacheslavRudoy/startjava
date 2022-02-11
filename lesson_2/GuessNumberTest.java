import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя игрока 1:");
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        Player player1 = new Player(nameOne);

        System.out.println("Введите имя игрока 2:");
        String nameTwo = scanner.nextLine();
        Player player2 = new Player(nameTwo);

        String nextRound = "";
        while (!nextRound.equals("no")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start(player1, player2);
            nextRound = "";

            while (!(nextRound.equals("no") || nextRound.equals("yes"))) {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                nextRound = scanner.nextLine();
            }
        }
    }
}
