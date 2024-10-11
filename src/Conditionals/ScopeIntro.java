package Conditionals;

import java.util.Scanner;

public class ScopeIntro {

    public static void main(String[] args) {
        // I første block er favoritmad "pizza"
      String favoritMad = "pizza";
        System.out.println(favoritMad);

        Scanner input = new Scanner(System.in);
        int inputtedNum =input.nextInt();

        // I anden block er favoritmad "chicken tacos"

        if (inputtedNum < 100) {
            favoritMad = "chicken tacos";
            System.out.println(favoritMad);
        }
        // I tredje vlock er favoritmad "steak"
        else {
            favoritMad = "steak";
            System.out.println(favoritMad);
        }
        }
    }
    /* Det betyder: da favoritMad blev lavet udenfor if-else-blocken
    er denne variabel både tilgængelig i if- og i else-blocken
    samt kan den få tildelt en ny værdi
    eks. "chicken tacos" eller "steak".
     */
