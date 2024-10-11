package Scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        double karaktergennemsnit = 10.8;
        String studerendeFuldeNavn = "Sofie Rytter";
        System.out.println(studerendeFuldeNavn + " " + "har et karaktergennemsnit på " +
                karaktergennemsnit);

        System.out.println("Hvad vil du updatere dit karaktergennemsnit til?");
        Scanner input = new Scanner(System.in);
        karaktergennemsnit = input.nextDouble();
        System.out.println(studerendeFuldeNavn + " " + "har nu et karaktergennemsnit på " +
                karaktergennemsnit);

    }
}
