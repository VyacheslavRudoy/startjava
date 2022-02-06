import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Введите имя игрока 1:");
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.nextLine();
        Player.player1 = new Player(nameOne);

        System.out.println("Введите имя игрока 2:");
        Scanner scanner1 = new Scanner(System.in);
        String nameTwo = scanner1.nextLine();
        Player.player2 = new Player(nameTwo);

        GuessNumber.game();
    }
}
