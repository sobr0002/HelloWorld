package Array.Methods;
/*Write a method that takes a single parameter:
An array of integers
The method returns the lowest value from the array */
public class MindsteVærdi {

    public static int mindsteVærdi(int[] tal) {

        //Laver en varibel, som hele tiden gemmer den nye mindste værdi fra mit array i main.
        int mindste = tal[0];

        //Itererer gennem array'et

        for (int i = 1; i < tal.length; i++) {

        /*Hvis tallet på indeks [i] er mindre end den nuværende værdi i 'mindste'-variablen,
          skal dette tal gemmes i 'mindste'-variablen. */
            if (tal[i] < mindste) {
                mindste = tal[i];
            }
        }
        //Returnerer værdien, som 'mindste'-variablen gemmer.
        return mindste;
    }
    public static void main(String[] args) {

        //Sender argumenter til metodens int-parameter.
        int[] talInput = {3, 4, 10, 214, 43};

        //Kalder metoden, som har kørt argumenterne igennem, og gemmer dem i ny variabel.
        int mindsteTalInput = mindsteVærdi(talInput);

        //Printer ny variabel.
        System.out.println(mindsteTalInput);
    }
}

