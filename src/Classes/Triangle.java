package Classes;

public class Triangle {
    //Her tilføjes attributter/egenskaber og adfærd.

    //Har en trekant med grundlinje, højde og længde.

    //Opretter double attributter for vores Triangle-Class.
    double grundlinje;
    double højde;
    double sidelængde1; //Attributter.
    double sidelængde2;
    double sidelængde3;
    /* = 5 attribut-variabler uden assignet værdier:
    Disse hedder instans-variabler;
    fordi hver instans vil have en specifik værdi for variablen.
     */

    /* Bruger en constructor til at initialisere til variablerne;
    altså give dem en startværdi:
    Skriver public class-name og tilføjer parametre i parentesen.
     */

    public Triangle(double grundlinje, double højde, double sidelængde1,
                    double sidelængde2, double sidelængde3) {

    /* Ovenstående parametre tillader os at tildele værdier til
    klassens attributter.
    */

    /* Vi tilgår Trianglens grundlinje med this. og assigner
     værdien 'grundlinje' fra ovenstående parameter.
     */
        this.grundlinje = grundlinje;
        this.højde = højde;
        this.sidelængde1 = sidelængde1; //Attributter = parametre.
        this.sidelængde2 = sidelængde2;
        this.sidelængde3 = sidelængde3;
    //Konstruktør = blot én adfærd for hele klassen -> der kan være flere.


    }
    //Attributterne er tilgængelige i hele klassen.
    //Constructor-parameters er kun tilgængelige inden i konstruktøren.
    // = in scope.

    //Laver funktion der beregner Trianglens areal:

    public double findAreal() {
    // Returnerer formlen for beregning af areal.
        return (this.grundlinje * this.højde) / 2;
    //Klassen er nu defineret.
    }

}
