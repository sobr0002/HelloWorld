package Scanner;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String line;

        Scanner input = new Scanner(System.in);
        System.out.print("Hvad drikker møller? ");

        line = input.nextLine();

        for (int i = 0; i <= 3; i++) {
            System.out.print(line);

        }
    }
}
