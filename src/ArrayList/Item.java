package ArrayList;
import java.util.ArrayList;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { //getter for navn
        return name;
    }

    public double getPrice() { //getter for pris
        return price;
    }

    /*public String toString() {
        return name + " " + price + " kr.";
    } */

    /* private ArrayList<Item> varer;

    public Item() { // Parameterløs konstruktør, som initialiserer Arraylist og tilføjer varer
        varer = new ArrayList<>();
        varer.add(new Item("Mælk", 10));
        varer.add(new Item("Honning", 30));
        varer.add(new Item("Kaffe", 49.95));
        varer.add(new Item("Græsk yoghurt", 34));
        varer.add(new Item("Jordbær", 25));

    }
        //Getter for at få adgang til listen fra ordrelinjen
    public  ArrayList<Item> getVarer() {
            return varer;

     */
    }

