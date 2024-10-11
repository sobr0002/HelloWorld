package Classes;
import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private boolean onOff;
    private int toggleCount;
    private static int lampAmount = 0;
    private static List<Lamp> lamplist = new ArrayList<>();//Array-liste til at holde alle lamperne.
    private String name; //navn på lampe

    public Lamp(String name, boolean onOff) {
        this.name = name;
        this.onOff = onOff;
        this.toggleCount = 0;
        lamplist.add(this); //this = lampeobjektet, som tilføjes til lampelisten
        lampAmount++; //tæller antal lamper
    }
    public static void printLampNames() {
        System.out.println("Du har " + lampAmount + " lamper:"); //foreach loop til at iterere gennem lampelisten
        for (Lamp lamp : lamplist) {
            System.out.println("Du har en " + lamp.getName());
        }
    }
    public boolean toggleLight() {
        onOff = !onOff; //når lampen ikke er onOff, returneres onOff
        toggleCount ++; //tæller antal gange en lampe tændes/slukkes
        return onOff;

    /*public boolean toggleLight() {
        if (onOff) { //hvis lampen er true, returnerer vi false (slukket)
            onOff = false;
        } else {
            onOff = true;
        }
        return onOff;*/
    }
    public boolean getonOff() {
        return onOff;
    }
    public int toggleCount() {
        return toggleCount;
    }
    public String getName() {
    return name;
}
    public int getLampAmount() {
        return lampAmount;
    }



    }




