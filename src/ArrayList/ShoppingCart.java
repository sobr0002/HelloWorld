package ArrayList;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Ordrelinje> ordrelinjer; //opretter ArrayListe med ordrelinjer udfra "Ordrelinje"-klassen

    //I konstruktøren initialiseres en ny, tom ArrayList-instans, hvor vi kan gemme elementer (her: Ordrelinje-objekter).
    public ShoppingCart() {
        ordrelinjer = new ArrayList<>(); //gemmer ordrelinje-objekter i ny variabel ordrelinjer = så den kan modtage ordrelinjer
    }

    //laver metode til at modtage ordrelinje til kurven
    public void nyOrdrelinje(Ordrelinje ordrer) {
        ordrelinjer.add(ordrer); //tilføjer ordrer til "ordrelinjer"-objektet
    }

    //metode til at beregne den samlede pris for alle varer i kurven
    public double totalPrice() {
        double total = 0; //laver lokal variabel, som gemmer total

        for (Ordrelinje i : ordrelinjer) { //itererer gennem ArrayList med foreach loop
            total += i.totalPrice(); //lægger 'i'-tælleren oveni totalprice og gemmer i total
        }
        return total;
    }

    //bruger toString metode til at udskrive alle varer i kurven
    @Override
    public String toString() {
        StringBuilder vareScan = new StringBuilder(); //tilføjer hver ordre og pris til den samme streng
        for (Ordrelinje i : ordrelinjer) {
            vareScan.append(i.toString()).append("\n");
        }
        vareScan.append("Samlet pris for kurven: ").append(totalPrice()).append(" kr");
        return vareScan.toString();
    }
}
