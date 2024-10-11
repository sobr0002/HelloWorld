package Scanner;
import java.util.Scanner;
public class NumberPower {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /* Write a Java program that reads a number (from the user) and
         the square, cube, and fourth power (fjerdepotens).
         */
        System.out.println("Enter a number and I'll raise it to the power of two, three and four.");
        int number = input.nextInt();
        double squarePower = Math.pow(number,2);
        double cubePower = Math.pow(number,3);
        double fourthPower = Math.pow(number,4);
        System.out.println("Input: " + number);
        System.out.println("Square: " + squarePower);
        System.out.println("Cube: " + cubePower);
        System.out.println("Fourth: " + fourthPower);

    }
}
