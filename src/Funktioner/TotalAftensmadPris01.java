package Funktioner;

public class TotalAftensmadPris01 {

    public static double calculateTotalAftensmadPris01(double listedPrice,
                                                       double tipRate,
                                                       double taxRate) {
        // De forskellige parametre til funktionen skrives i variabler.
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        // Priserne summereres for at udregne den totale.
        double result = listedPrice + tip + tax;
        // De summererede priser gemmes i variablen "result".
        return result;
    }
    // Nu starter hovedfunktionen
    public static void main(String[] args) {
        // Anfør madpris, tiprate og taxrate og gem i en variabel.
        double gruppeTotalAftensmadPris = calculateTotalAftensmadPris01(100, .2, .08);
        // Print den endelige pris ud.
        System.out.println(gruppeTotalAftensmadPris);

        /* Vi dividerer den totale aftenmadspris med 5, og gemmer den i en
        variabel, som individuel pris.
         */
        double individuelTotalAftensmadPris = gruppeTotalAftensmadPris / 5;
        // Vi printer nu prisen til brugeren
        System.out.println(individuelTotalAftensmadPris);

        /* = En returtype (vores double) er nu tilføjet. Det kunne også have
        været en anden variabeltype.
         */
    }
}
