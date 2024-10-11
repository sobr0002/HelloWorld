package Classes;
import java.util.Random;
public class Terning {
// Laver et terningespil, som kaster tilfældige tal.

// Opretter tre attributter: maxværdi, terningens værdi og tilfældig værdi.
    int max = 6;
    int faceValue;
    Random værdi;

// Laver konstruktør som assigner en tilfældig startværdi til objektet.
    public Terning() {
    //Assigner en tilfældig værdi til "værdi"-variablen.
        værdi = new Random();
    //Kalder roll() i konstruktøren for at sikre, at faceValue (objektet) har en startværdi med det samme.
        roll();
    }
//Laver metode som assigner en tilfældig værdi fra "værdi"-variablen fra max-variablen(6) og mindst 1.
    public void roll() {
        faceValue = værdi.nextInt(max) + 1; //facevalue må være en random'værdi' mellem 1 og max(6).

    }
//Metode til at returnere den endelige terningeværdi (som er en int), der er gemt i attributten.
    public int endeligFaceValue() {
        return faceValue;
    }
//toString metode til at sende en String-værdi med værdien fra faceValue.
    public String toString() {
        return "Du har slået: " + faceValue;
    }

}
