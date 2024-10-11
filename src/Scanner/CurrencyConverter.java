package Scanner;
import java.util.Scanner;
/* Create a money conversion java program.
It should give the user a welcoming message. After the welcome message the user
should write an amount in kr. This amount should be converted to at least 4
different currencies and printed to the user in an easy way to understand.
 */
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your personal currency converter! I shall " +
                "convert the desired amount into four different currencies."+"\n"
        + "Please enter the amount in dkk you wish to convert:");
        double dkk = input.nextInt();
        double dollar = dkk * 0.148222;
        double euro = dkk * 0.13401434;
        double aud = dkk * 0.22058015;
        double pound = dkk * 0.11308586;
        System.out.println("The amount of: " + dkk + " dkk is: "+"\n"+ dollar + " US dollars."+"\n"+
                 euro + " euro." +"\n"+ aud + " australian dollars" + "\n"+
                pound + " british pounds.");


    }
}
