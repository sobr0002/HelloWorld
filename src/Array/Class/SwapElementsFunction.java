package Array.Class;
import java.util.Arrays;
public class SwapElementsFunction {

//Lav metode som kan reversere alle heltal i array. Returnér det reverserede array.

    public static int[] hjælpeReversed(int[] tal) {


        for (int i = 0; i < tal.length / 2; i++) {
            int temp = tal[i];

            tal[i] = tal[tal.length - 1 - i];
            tal[tal.length - 1 - i] = temp;

        }
        return tal;
    }

    public static void main(String[] args) {

        int[] kerneTal = new int[] {1, 2, 3, 4, 5, 6};
        //Gem metodens resultat i int-array [], da metoden returnerer et array.
        int[] reservedTal = hjælpeReversed(kerneTal);

        System.out.println(Arrays.toString(reservedTal));

    }
}
