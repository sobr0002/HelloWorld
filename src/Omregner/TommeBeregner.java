package Omregner;

import java.util.Scanner;

public class TommeBeregner {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jeg vil omregne tommer til centimeter for dig. Angiv din værdi:");
        double tommer = input.nextDouble();

        double svar =(2.54 * tommer);
        System.out.println("Svaret er" + " " + svar);





    }
}
