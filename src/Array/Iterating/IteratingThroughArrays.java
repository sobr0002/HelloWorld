package Array.Iterating;

import java.util.Arrays;

public class IteratingThroughArrays {

//Når mere end ét element i array'en skal printes, bruges for loop til iteration.
    public static void main(String[] args) {
        int[] arr = new int[]{92, 12, 38, 74};

//Iterere hvert indeks i array forlæns. Icrement by 1.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
//Iterere hvert indeks i array baglæns. Decrement by 1.
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);
        }
        System.out.println();
//Iterere hvert andet indeks i array'et baglæns. Derfor i=i-2
        for (int i = arr.length -1; i >= 0; i=i -2) {

            System.out.println(arr[i]);
        }
        System.out.println();

        // Java Streams bruges til at tilgå hvert element med kun én linje kode.
        // Man styrer ikke, hvordan loopet itererer. Her printes den forlæns.

        Arrays.stream(arr).forEach(System.out::println);

        //Arrays.stream(arr).filter() -> finde et specifikt element, vi skal bruge.
        //Arrays.stream(arr).average() -> finde gennemsnittet af elementerne.
        //Arrays.Stream(arr).sum() -> finde summen af elementerne.
    }
}