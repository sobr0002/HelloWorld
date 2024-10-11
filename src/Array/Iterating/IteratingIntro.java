package Array.Iterating;

import java.util.Arrays;

public class IteratingIntro {

    public static void main(String[] args) {


//Lav et tomt array som kan indeholde 8 elementer af typen int.
    int[] elements8 = new int [8];

//Assign værdien 34 på den første plads i arrayet, og assign værdien
// 117 på den sidste plads i arrayet.
    elements8[0] = 34;
    elements8[7] = 117;

//Lav et for-loop, der itererer over arrayet og udskriver alle værdierne
    for (int i=0; i<elements8.length; i++) {
        System.out.println(elements8[i]);
    }
/*Lav et array med Strings, som er 3 elementer langt og indeholder værdierne
 ”Hej”, ”med” og ”dig”. */

String[] hilsen = {"Hej ", "med ", "dig"};

/*Lav et for each-loop der itererer over arrayet og udskriver de tre
Strings lige efter hinanden.
 */

//Importér java.util.Arrays;-class for at bruge Streams.
        Arrays.stream(hilsen).forEach(System.out::print);

/*Lav et array med doubles som indeholder værdierne 3.4, 2.5, 1.2, 6.7.
Hvad sker der hvis du forsøger at udskrive en værdi på index 4?
= outOfBoundsException -> udenfor indeksnummer.
 */

        double[] decimalTal = {3.4, 2.5, 1.2, 6.7};
        //Udskriv den værdi der står på index 2.
        System.out.println(decimalTal[2]);
        //Udskriv også længden på arrayet.
        System.out.println(decimalTal.length);
        }

}

