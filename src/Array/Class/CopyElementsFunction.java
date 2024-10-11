package Array.Class;
import java.util.Arrays;
public class CopyElementsFunction {

//Lav metode der returnerer et nyt array, hvor hver værdi er kopieret.

    public static int[] stutter(int[] numbers) {

        int[] result = new int[2 * numbers.length];

        for (int i = 0; i < numbers.length; i++) {

        //Værdien fra indeksnummeret ved første iteration ganges med 2.
            result[2 * i] = numbers[i];

        //Det samme gøres ved den næste indeksværdi i iterationen osv..
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] numberInput = {1, 2, 3, 4, 5};

        int[] stutterInput = stutter(numberInput);
        System.out.println(Arrays.toString(stutterInput));

    }
}
