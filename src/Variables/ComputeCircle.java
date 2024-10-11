package Variables;
import java.lang.Math;

public class ComputeCircle {
    public static void main(String[] args) {

        /* Beregn cirkels areal og omkreds.
        OBS: Importér lang.math

         */
        double radius = 7.5;
        double perimeter = 2 * radius * Math.PI;
        System.out.println(perimeter);
        double areal = Math.PI * Math.pow(radius,2);
        System.out.println(areal);
    }
}
