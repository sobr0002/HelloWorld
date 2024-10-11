package Scanner;
import java.util.Scanner;
public class UserInputString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type a sentence of your choosing:");
        String inputString = input.nextLine();
        System.out.println(inputString);

    }
}
