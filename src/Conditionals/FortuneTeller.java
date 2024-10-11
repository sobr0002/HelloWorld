package Conditionals;

import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {
        /* Lav print-statement, som beder brugeren om at vælge et tal
        mellem 1 og 10 */
        System.out.println("Vaelg et tal mellem 1 og 10.");

        // Impotér scanner, som læser det næste input fra brugeren:
        Scanner input = new Scanner(System.in);

        // Inputtet gemmer vi i variablen "inputTal":
        int inputTal =input.nextInt();

        /* Tag en beslutning: hvad skal der ske?
        Hvis inputTal er <5 får brugeren et "held og lykke"
        Ellers får brugeren en anden lykønskning (inputTal>5)
        = if-else-statement:
         */
        if (inputTal <5) {
            System.out.println("Held og lykke i dag!");
        }
        else {
            System.out.println("Solen skinner. Ogsaa paa en graa dag");
        }

    }
}
