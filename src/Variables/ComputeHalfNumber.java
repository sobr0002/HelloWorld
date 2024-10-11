package Variables;

import java.util.Scanner;

public class ComputeHalfNumber {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide a number");

        double inputNumber = input.nextDouble();
        System.out.println("Half of the number is: " + inputNumber / 2);


    }
}
