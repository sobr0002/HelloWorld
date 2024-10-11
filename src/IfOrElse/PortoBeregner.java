package IfOrElse;

import java.util.Scanner;

public class PortoBeregner {
    /* Lav en klasse der hedder Portoberegner. Portoberegner-klassen har en Scanner der kan læse ind
    fra tastaturet hvor meget et brev vejer. Vægten angives i hele gram.
    Lav en int variabel i din klasse som hedder pris. Denne sættes fra starten til værdien 0.
    Brug if-else til at afgøre hvad prisen på forsendelsen skal være. I stedet for at skrive
    prisen ud med System.out.println inde i hver if-sætning, sættes værdien af variablen pris som
    så først udskrives til sidst.
    Hvis brugeren skriver et antal gram som er 0 eller et negativt tal, eller mere end 2000 gram,
    så skal programmet udskrive ”Et brev med denne vægt kan vi ikke sende”.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast venligst vægten på dit brev angivet i gram.");

        int price = 0;
        int weight = 0;
        weight = input.nextInt();

        if (weight > 0 && weight <= 100) {
            price = 25;
        } else if (weight > 100 && weight <= 250) {
            price = 50;
        } else if (weight > 250 && weight <= 2000) {
            price = 75;
        }
        else {
            System.out.println("Et brev med denne vægt, kan vi ikke sende");
        }

        {   System.out.println("Brevet koster" + " " + price + " kr. at sende");

        }
    }
}

