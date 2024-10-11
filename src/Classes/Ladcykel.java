package Classes;

public class Ladcykel {

    private String colour;
    private int wheels;
    private int passenger;
    private double newPrice;
    private Cyklist cyclist;

    public Ladcykel(String colour, int wheels, int passenger, double newPrice) {
        this.colour = colour;
        this.wheels = wheels;
        this.passenger = passenger;
        this.newPrice = newPrice;
        this.cyclist = null; //Ingen cyklist fra start.

    }
    public double newPrice() { //giver ladcyklens nypris
        return newPrice;
    }
    public String toString() { //giver beskrivelse af cykel
        String nameofCyclist = (cyclist != null) ? cyclist.getName(): "No cyclist on board";
        return "Hello " + nameofCyclist + "\n" +
                "The colour of the bike is " + colour + "\n" +
                "The amount of wheels is " + wheels + "\n" +
                "It's able to have " + passenger + " passengers \n" +
                "All for the price of " + newPrice + " dkk.";
    }
    public boolean cyclistSits(Cyklist c) { //cyklist sætter sig, hvis der ikke sidder en i forvejen.

        if (this.cyclist == null) {
            this.cyclist = c;
            return true;
        } else {
            return false; //fordi der allerede er en cyklist.
        }
    }
    public Cyklist whoDrivesTheLadcykel() {
        return cyclist; //Returnerer cyklisten der kører eller null, hvis ingen kører.
    }

    public Cyklist cyclistGetsOff() {
        if (cyclist != null) {
            Cyklist cyclist1 = cyclist; //gem nuværende cyklist.
            cyclist = null; // Cyklist fjernes fra ladcyklen.
            return cyclist1;
        } else {
            return null; //Når der ingen cyklist er, kan denne ikke fjernes.
        }
    }

}
