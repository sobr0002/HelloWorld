package Classes;
//Lav en klasse der hedder Cirkel, med instansvariablen radius af typen double.
public class Cirkel {

    double radius;

/* Den skal have en konstruktør der tager radius som parameter og sætter
instansvariablen radius til denne værdi.
 */

    public Cirkel(double radius) {
        this.radius = radius;

 /*Cirkelklassen skal have en beregnAreal-metode som skal returnere en double.
 NB! brug Math-klassen til at få fat i pi. Det gøres ved at skrive Math.PI
 (ingen parenteser, og PI med store bogstaver).
  */
    }
   public double beregnAreal() {
       return Math.PI * (this.radius * this.radius);

               //Math.PI * Math.pow(this.radius,2);
        }





}
