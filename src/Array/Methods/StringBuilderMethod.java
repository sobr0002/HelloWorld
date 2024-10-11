package Array.Methods;

public class StringBuilderMethod {
    //Write a method that takes two parameters:
//An array of Strings
//An integer n
//The method prints the String on the nth index.

    public static String stringPrint(String[] s, int[] n) {
//Brug StringBuilder-class til at opbygge/manipulere Strings
        StringBuilder gemmer = new StringBuilder();

        for (int i = 0; i < n.length; i++) {

           if (n[i] >= 0 && n[i] < s.length) {

               //.append betyder: tilføje noget til slutningen af eksisterende objekt.
               gemmer.append(s[n[i]]).append(" "); //Tilføjer strengen fra det relevante indeks.
           }
           else {
               return "Værdi uden for indeks.";
           }
    }
    return gemmer.toString().trim(); //Returnerer den opbyggede String.
        /*.trim : sletter hvis der er tomme mellemrum før og efter en String.
        Mellemrum inde i String påvirkes ikke. */
    }

    public static void main(String[] args) {
        int[] indeks = {0, 3}; //Indekser du vil bruge, som gemmes i int-array.
        String[] navne ={"Torben", "Mads", "Tulle", "Morten"}; //String værdier.

        //Kalder metoden, som har fået tildelt argumenter fra String[] navne.
        String gemmer = stringPrint(navne, indeks); //navne først, da det er en String.
        //Printer indeks 0 og 3, som er "Torben" og "Morten".
        System.out.println(gemmer);


    }

}
