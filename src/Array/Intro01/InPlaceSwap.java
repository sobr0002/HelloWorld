package Array.Intro01;
import java.util.Arrays;
/* In-place reversering:
I stedet for at oprette et nyt array, bytter vi elementerne direkte i 'tal'
vha. en midlertidig variabel temp.
Halvvejs iteration: Vi itererer kun halvdelen af arrayet,
da vi bytter elementerne fra begge ender. */
public class InPlaceSwap {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5 , 6};

        for (int i = 0; i < numbers.length / 2; i++) {

            int temp = numbers[i];

        //For hver iteration beregner vi det rigtige indeks i numbers som numbers.length - 1 - i
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length -1 - i] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
