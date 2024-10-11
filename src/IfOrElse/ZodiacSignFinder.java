package IfOrElse;

import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String [] args) {

        // Lav et Scanner objekt inde i main metoden, der kan læse inputs fra brugeren.
        Scanner input = new Scanner(System.in);

        /* Bed din bruger om at skrive måneden for deres fødselsdag
        som et tal (1-12), og gem det i en variabel
         */
        System.out.println("Hvilken måned har du fødselsdag? Vælg tal fra 1-12");
        int month = input.nextInt();

        if (month > 12) {
            System.out.println("Der er kun 12 måneder");
            System.exit(0);
        }

        /* Bed din bruger om at skrive dagen for deres fødselsdag
        som et tal (1-31), og gem det i en anden variabel.
         */

        System.out.println("Hvilken dato har du fødselsdag? Vælg tal fra 1-31");
        int day = input.nextInt();

        if (day > 31) {
            System.out.println("Der er maks 31 dage på en måned");
            System.exit(0);
        }


        // Brug if – else statements til at bestemme deres stjernetegn ud fra brugerinput.


        if (month == 1) {
            if (day < 21)
            System.out.println("Du er stenbuk!");
            else System.out.println("Du er vandmand!");
        }
        else if (month == 2) {
            if (day < 19)
                System.out.println("Du er vandmand!");
            else System.out.println("Du er fisk!");
        }
        else if (month == 3) {
            if (day < 21)
                System.out.println("Du er fisk!");
            else System.out.println("Du er vædder!");
        }
        else if (month == 4) {
            if (day <21)
                System.out.println("Du er vædder!");
            else System.out.println("Du er tyr!");

        }



        }


    }












        // Print brugerens stjernetegn.



