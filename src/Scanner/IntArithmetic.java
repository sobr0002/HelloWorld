package Scanner;
import java.util.Scanner;
/* Write a Java program that accepts two integers from the user and then prints
the sum, the difference, the product, the average, the distance (the difference
between integer), the maximum (the larger of the two integers), the minimum
(smaller of the two integers)
 */
public class IntArithmetic {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first integer:");
        int inputInt1 = input.nextInt();
        System.out.println("Enter your second integer:");
        int inputInt2 = input.nextInt();

        int sum = inputInt1 + inputInt2;
        int difference = inputInt1 - inputInt2;
        int product = inputInt1 * inputInt2;
        int average = sum / 2;


        System.out.println("The sum is:" + sum +"\n"+ "The product is: " + product
        + "\n" + "The difference is: " + difference + "\n" + "The average is: " +
                average + "\n" + "The ");


    }
}
