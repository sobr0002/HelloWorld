package Array.Intro01;

public class KatteArray {
    public static void main(String[] args) {
        String[] katte = {"Jytte", "Bjarne", "Skipper", "Gustav", "Victor"};


        /* Jeg vil gerne printe kattenavnene i en String, hvor hver kat/element
        siger ''mjaw''.
         */

        //Sætter tælleren til at starte ved 0, dvs. Jytte og inkrementere med 1.
        for (int i = 0; i < katte.length; i++) {
            System.out.println(katte[i] + " siger mjaw!");
            System.out.println(katte[katte.length - 1]);
        }
    }
}
