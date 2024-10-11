package Scanner;
import java.util.Scanner;
/* Write a program that prompts the user to input 5 numbers
from keyboard. Find & print their sum and average.
 */

public class Input5Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number1 = input.nextDouble();
        System.out.println("Enter a second number:");
        double number2 = input.nextDouble();
        System.out.println("Enter a third number:");
        double number3 = input.nextDouble();
        System.out.println("Enter a fourth number:");
        double number4 = input.nextDouble();
        System.out.println("Enter a fifth number:");
        double number5 = input.nextDouble();
        double sumNumbers = number1 + number2 + number3 + number4 + number5;
        double averageNumbers = sumNumbers / 5;

        System.out.println("The sum of the entered numbers is " + sumNumbers + " and the " +
                "average of the sum of your numbers is " + averageNumbers);


    }
}
