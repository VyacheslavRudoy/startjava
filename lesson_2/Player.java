import java.util.Scanner;

public class Player {
    private String name;
    public static Player player1 = new Player();
    public static Player player2 = new Player();

    public Player() {
        name = "No name";
    }

    public Player(String name) {
        if (name.equals("")) {
            name = "No name";
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format(name);
    }

    public static int guess() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }
}
