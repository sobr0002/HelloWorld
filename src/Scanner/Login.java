package Scanner;
import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        Scanner myObjectMapperDataCloud = new Scanner(System.in);
        System.out.println("Please write your name here:");
        String name = myObjectMapperDataCloud.nextLine();
        String input = name + " - Thank you for logging in \uD83C\uDF89";
        System.out.println(input);

    }
}
