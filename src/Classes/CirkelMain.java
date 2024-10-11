package Classes;

public class CirkelMain {
/*Test Cirkelklassen i den samme main-metode som du testede
Firkant-klassen: lav nogle Cirkel-objekter og check om din
beregnAreal-metode virker som den skal.
 */

    public static void main(String[] args) {
    /*Kalder contructer ved navn og sender værdien, radius, til constructor,
    som behandler værdien.
     */
        Cirkel cirkelOne = new Cirkel(10);

    /*Gemmer den beregnede værdi i cirkelAreal-variabel ved at kalde variabelnavn
    cirkelOne og konstruktøren beregnAreal().

     */
        double cirkelAreal = cirkelOne.beregnAreal();


        System.out.println(cirkelAreal);
    }

}
