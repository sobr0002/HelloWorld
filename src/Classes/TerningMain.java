package Classes;

public class TerningMain {
    public static void main(String[] args) {

//Kalder Class/skabelonen "Terning" og konstruktøren "new Terning()" for at initialisere objektet.
        //Objekterne er dice1 og dice2.
        Terning dice1 = new Terning();
        Terning dice2 = new Terning();

        //Skriver variabelnavne dice1 og dice2 og kalder metoden roll() for at bruge den på disse variabler.

        dice1.roll();
        dice2.roll();
        System.out.println(dice1);
        System.out.println(dice2);
    }
}
