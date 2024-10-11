package Classes;

public class Rectangle {
/* Hvilke karakteristika har en rektangel?
    -> længde og bredde = globale variabler AKA felter. */

    //Private = således felterne kun er tilgængelige inde i denne klasse.
    private double længde; //Rektanglens felter.
    private double bredde;

    /* Hvilke operationer kan foretages på en rektangel?
    = beregn omkreds -> Her bruges metoder i samme klasse.
     */

    /*public = således konstruktøren kan kaldes.
    Dette er en default-constructor. */
    public Rectangle(){
        længde = 0;
        bredde = 0;
    }
    /* En konstruktør, som kan modtage parametre fra den, der kalder
    konstruktøren */
    public Rectangle(double længde, double bredde) {
        //For at tildele værdier til felterne, kaldes setter-metoden.
        setLængde(længde);
        setBredde(bredde);
    }

    //public = så vi kan kalde metoden til at beregne en værdi for os.
    public double beregnOmkreds() {
        return (2 * længde) + (2 * bredde);
    }
    //public = for at metode kan kaldes og bruges.
    public double beregnAreal() {
        return længde * bredde;
    }
    //Laver getter-metode, og returnerer længde.
    public double getLængde() {
        return længde;
    }
    //Setter modtager en lokal værdi fra "længde".
    public void setLængde(double længde) {
    //Setter assigner længden til klassens globale længde "this.længde".
        this.længde = længde;
    }

    public double getBredde() {
        return bredde;
    }
    //Setter den lokale varibel til den globale variabel.
    public void setBredde(double bredde) {
        this.bredde = bredde;
    }

}
