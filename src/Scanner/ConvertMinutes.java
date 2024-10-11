package Scanner;
import java.util.Scanner;
public class ConvertMinutes {
    /* Write a Java program to convert minutes into a number of years and days.
    The user should be able to put in how many minutes he wants to convert.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user for number of minutes to convert.
        System.out.println("Please enter the number of minutes, you wish to convert into years and days:");
        int minutes = input.nextInt();

        // Number of minutes in a year
        int year = minutes / 525000;
        int remainingMinutes = minutes % 525000;
        int day = remainingMinutes / 1440;

        System.out.println(minutes + " minutes are: " + year + " year and " + day + " day(s)");


    }
}
