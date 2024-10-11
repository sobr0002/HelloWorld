package Array.Iterating;

public class MinMaxArray {
//Lav en main-metode og et double-array med værdierne
// {4.5, 25.3, 12.1, 34.0, 15.5 }.

    public static void main(String[] args) {
        double[] maxMin = {25.3, 12.1, 34.0, 15.5, 4.5};


        /*Skriv et for-loop der itererer gennem et array, opløfter hvert
        tal i anden potens og skriver det ud til konsollen. */

        for (int i = 0; i < maxMin.length; i++) {
            System.out.println(Math.pow(maxMin[i], 2));
        }
//Skriv et for-loop der finder den mindste værdi i arrayet.
        double smallest = maxMin[0];
        for (int i = 0; i < maxMin.length; i++) {

            if (maxMin[i] < smallest) {
                smallest = maxMin[i]; //tildel mindste værdi til den nye variabel smallest.
            }
            //Lav sout udenfor loop
        }
        System.out.println(smallest);

//Skriv et for-loop der finder den største værdi i arrayet.

        double largest = maxMin[0];
        for (int i = 0; i < maxMin.length; i++) {

            if (maxMin[i] > largest) {
                largest = maxMin[i];
            }

        }
        System.out.println(largest);

        /* Skriv et for-loop der leder efter værdien 12.1. Hvis det tal
        findes i arrayet skal programmet udskrive ”Hurra! Jeg fandt 12.1.
        Det stod på index ” + hvilket index det så end stod på.
         */

        double specificElement = 12.1; //Tildel ny variabel den ønskede værdi, der skal findes.
        for (int i = 0; i < maxMin.length; i++) {
            if (maxMin[i] == specificElement) {

                System.out.println("Hurra! Jeg fandt " + maxMin[i] + ". Det stod" +
                        "på index " + i + "hvad index det så end stod på.");
            }

        }
    }

    }


