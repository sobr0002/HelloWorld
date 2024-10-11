package Array.Arithmetic;

public class DivisionElementIf {

    /* Lav en metode, der diverer elementerne én efter én og returnerer den samlede
    værdi i ét array.
     */

    public static double divisionArray(double[] array) {

        if (array.length == 0) { //Betingelse: hvis array'et et tomt.
            throw new IllegalArgumentException("Array'et skal indeholde værdier for at kunne dividers.");
        }

        double division = array[0]; //Start fra 1. element index 0

        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0) { //Betingelse: værdien 0 i array'et er ikke tilladt.
                throw new IllegalArgumentException("Det er ikke tilladt at dividere med nul.");

        }
            division /= array[i];
        }
        return division; //Returnér det endelige resultat af divisionen.
    }

    public static void main(String[] args) {

        double[] numbers = {10, 2, 10};

        double result = divisionArray(numbers);

        System.out.println(result);
    }
}

