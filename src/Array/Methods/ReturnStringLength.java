package Array.Methods;

public class ReturnStringLength {
    /*Skriv en metode der kan finde og returnere antal strenge, som indeholder en bestemt
    bogstavssekvens i et String array.
    Parameteren kaldet sekvens repræsenterer en bogstavssekvens, som der skal ledes efter
    i arrayet kaldet liste.*/

    public static int findAntal(String[] liste, String sekvens) {

        int antal = 0;

        //Itererer igennem listen for at se, om denne indeholder sekvens fra String-sekvens.
        for (int i = 0; i < liste.length; i++){

            if (liste[i].contains(sekvens)) { //hvis liste[] indeholder 'sekvens'-parameteret fra metoden.
                antal++; //Hvis ja, øg tælleren.
            }
        }
        return antal;

    }

    public static void main(String[] args) {

        String[] bogstavsekvens = {"banan", "an"};
        String søgning = "an";

        //Printer og kalder metoden indeholdende de to variabler i main.

        System.out.println(findAntal(bogstavsekvens, søgning)); // 2

    }

    }





