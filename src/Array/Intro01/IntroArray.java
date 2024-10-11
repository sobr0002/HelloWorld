package Array.Intro01;
import java.util.Arrays;
public class IntroArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        /* Bruger stream-class til at kunne finde summen af elementerne i
        arrayen */

        System.out.println(Arrays.stream(a).sum());
    }
}
