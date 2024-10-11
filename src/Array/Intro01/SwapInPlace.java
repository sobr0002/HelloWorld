package Array.Intro01;
/* In-place reversering:
I stedet for at oprette et nyt array, bytter vi elementerne direkte i 'tal'
vha. en midlertidig variabel temp.
Halvvejs iteration: Vi itererer kun halvdelen af arrayet,
da vi bytter elementerne fra begge ender. */

import java.util.Arrays;

public class SwapInPlace {

    public static void main(String[] args) {

        //Kan også gøres uden at oprette nyt array

        int[] tal = new int[]{22, 33, 44, 55, 66};

        //Reverser arrayet in-place
        for (int i = 0; i < tal.length / 2; i++) {

            //Swap elements ved at gemme i ny variabel
            int temp = tal[i];

            tal[i] = tal[tal.length - 1 - i];
            tal[tal.length - 1 - i] = temp;

        } //Printer uden for loopet.
        System.out.println(Arrays.toString(tal));
    }
}
