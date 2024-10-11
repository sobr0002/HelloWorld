package Array.Class;
import java.util.Arrays;
import static java.util.Arrays.copyOf;
public class CopyElements {

    public static void main(String[] args) {

        int[] kopier = {1,2,3,4,5,122};

    //Lav variabel som gemmer kopien af det gamle array.

        int[] kopieretArray = copyOf(kopier,9);//Resten bliver sat til 0, da array'ets længde kun er 6
        System.out.println("Originalt array: " + Arrays.toString(kopier));
        System.out.println("Kopieret array: " + Arrays.toString(kopieretArray));


    }
}
