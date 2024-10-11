package Classes;

public class Tile {

    char letter;
    int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public String toString() {
        return "Bogstavet er: " + letter + "\n" +
                "Værdien er: " + value;
    }
}
