package Scanner;
import java.util.Scanner;
public class UserInputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        int age = scanner.nextInt();
        int agePlusTwo = age + 2;
        System.out.println("Your age plus two is: " + agePlusTwo);

        System.out.println("Enter your age again:");

        int age1 = scanner.nextInt();
        double doubleAge = age1 * 2;
        System.out.println("Your double age is: " + doubleAge);


    }
}
