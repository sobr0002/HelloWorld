package Array.Intro01;
import java.util.Arrays;
public class Stream {

    // For at printe arrayens kode ud på én linje.
    public static void main(String[] args) {
        int[] age = {12, 24, 31, 42, 50};

        Arrays.stream(age).forEach(System.out::println);

        //Gennemsnittet af elementer i array.
        Arrays.stream(age).average().ifPresent(System.out::println);

        //Maksværdi i array.
        Arrays.stream(age).max().ifPresent(System.out::println);

        //Minimumværdi i array.
        Arrays.stream(age).min().ifPresent(System.out::println);
    }
}
