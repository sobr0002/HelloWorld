package Switch;

import java.util.Scanner;

public class Trafiklys {
    /* Bed brugeren om at skrive en farve
brug switch statement til at printe det korrekte svar {"stop", "vent" eller "gå"}
Brug en ternary operator til at printe enten
"Det er sikkert at krydse vejen" eller "Det er ikke sikkert at krydse vejen".
     */
    public static void main(String [] args) {
        Scanner inputFarve = new Scanner(System.in);
        System.out.println("Skriv en farve: rød, gul eller grøn");

        String farve = "";
        farve = inputFarve.nextLine().toLowerCase().trim();


        switch (farve) {
            case "rød":
                System.out.println("Stop");
                break;

            case "gul":
                System.out.println("Vent");
                break;

            case "grøn":
                System.out.println("Gå");
        }

        String slut = (farve.equals("grøn")) ? "Det er sikkert at krydse vejen":
                "Det er ikke sikkert at krydse vejen";

        System.out.println(slut);
    }








}


