package Variables;

public class ComputeResult {
    /* Beregn og print resultat.
    Brug double, så svar kan blive decimaltal.
     */
    public static void main(String [] args) {
        double svar = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println(svar);

        // Beregn hvor mange miles er 19 km?

        double km =19;
        double miles = km * .621371;
        System.out.println(miles);
    }
}
