package Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BMI {
    public static void main(String [] args) {
        /* Write a program that prompts the user to input their name, height & weight.
        Calculate & print their BMI number and provide the answer with a friendly message
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Please enter your height in meter:");
        double height = input.nextDouble();
        System.out.println("Please enter your weight in kg");
        int weight = input.nextInt();
        double sumBMI = weight / (height * height);
        System.out.println(name + ", your BMI is " + sumBMI + ". " + "Have a wonderful day!");



    }

}
