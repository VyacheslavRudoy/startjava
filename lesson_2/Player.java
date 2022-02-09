import java.util.Scanner;

public class Player {
    private String name;

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
}
