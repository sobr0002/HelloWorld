package Array.largestElement;
import java.util.Arrays;
public class FourBoolean {

    public static void main(String[] args) {

//Create an array with 4 boolean
        boolean[] empty = new boolean[4]; //Værdien i indekserne = false, da de ikke er angivet her.

        System.out.println("Indekset er tomt, derfor er resultatet: " + Arrays.toString(empty)); //Se konsol.

        //Change the last element to true
        boolean[] notEmpty = {true, false, true, false};
        notEmpty[3] = true; //Ændres ved at skrive array navn[indeksnr.] og sætte lig ny værdi af indekset.

        System.out.println(notEmpty[3]);
    }
}
