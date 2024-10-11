package Array.Intro01;
import java.util.Arrays;

public class Swap {
//Write code that reverses the elements of an array:
    public static void main(String[] args) {

        int[] numbers = new int[] {11, 42, -5, 27, 0 ,89};

        //Opret nyt array til de omvendte værdier.
        int[] reversed = new int[numbers.length];

        //Iterer over det originale array forlæns.

        for (int i = 0; i < numbers.length; i++) {
        /*Fylder det nye array "reversed" baglæns.
        Dvs. når i=0, tager vi sidste element, som er 89, når i=1
        tager vi elementet før 89 nemlig 0 osv. */
            reversed[i] = numbers[numbers.length -1 -i];
        }
        //Således skifter elementerne plads.

        //Udskriv det omvendte array
        System.out.println(Arrays.toString(reversed));

        }


    }


