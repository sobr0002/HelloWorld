package Funktioner;

import java.util.Scanner;
import java.util.Scanner;

public class Tetid {
    public static void annoncerTetid() {
        System.out.println("Vent på tetid");
        System.out.println("Skriv et tilfaeldigt ord og tryk enter"
        + " for at starte tetid");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Det er tetid!");
    }

    public static void main(String[] args) {
        System.out.println("Velkommen til hotellet");
        annoncerTetid();

        System.out.println("Skriv en kode");
        System.out.println("Anmeld koden");
        System.out.println("Lær at kode");

        annoncerTetid();

        System.out.println("Få en vaerelsesupgrade!");


    }
}
