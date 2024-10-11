package Scanner;
import java.util.Scanner;
public class UserInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a whole number from 0-100:");

        int inputTal = input.nextInt();

        System.out.println(inputTal * 1000);

    }
}
