package Array.Iterating;

public class ChangeStrings {
    public static void main(String[] args) {

 /*Change all elements with the string Jens to Jens 🔥 Use a normal for loop to change all occurences of
 Jens in the above list.
  */
        String[] names ={"Peter", "Sarita", "Jens", "Julie", "Jens"};
        //Der kan itereres baglæns.
        for (int i = names.length - 1; i >= 0; i--) {
            if (names[i].equals("Jens")) { //Sætter iterationen til at finde "Jens" ved at .equals
                names[i] ="Jens \uD83D\uDD25"; //De elementer iterationen finder med Jens får ny værdi.
                System.out.println(names[i]);
            }
        }

        //Der kan itereres forlæns
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Jens")) {
                names[i] = "Jens \uD83D\uDD25";
                System.out.println(names[i]);
            }
        }

    }
}
