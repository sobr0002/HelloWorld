package Array.Arithmetic;

public class ProductOfElements {


    /*Metoden der finder produktet af alle elementer i int array'et.
    Bruger metoden til at gange elementerne med hinanden og hele tiden gemme
    det nyeste produkt i en variabel, der starter på 0.
    */

    public static int productArray(int[] array) {

        int product = 1; /*Værdien skal starte på 1. Hvis den starter på 0,
        ganger man med 0, som altid vil give 0. */

        for (int i = 0; i < array.length; i++) {
            product *= array[i]; //Her assignes hvert element til product.
        }
        return product; /*Returnerer det samlede produkt til vores int variabel product,
        der gemmer/holder værdien */
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 11, 458}; //Sender argumenter til int-parametret i metoden.

        int result = productArray(numbers); /*Gemmer det endelige produkt af de argumenter, jeg har
        sendt til parameteret i metoden, hvoraf metoden har multipliceret dem */

        System.out.println(result); //Printer endelig produkt.
    }



}
