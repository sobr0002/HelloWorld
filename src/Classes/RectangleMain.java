package Classes;
/* Opret en klasse, der instansierer Rectangle-klassen for
at beregne arealet af to værelser i et hus.
 */

public class RectangleMain {

    public static void main(String[] args) {

/* 1. Skriv datatype = navnet af den klasse, "Rectangle" vi skal instansiere.
   2. Giv objektet et navn "værelse1".
   3. Lav en instans vha. "new" + konstruktørens navn, som objektet er lavet ud fra.
 */

//Vi har kaldt default-konstruktøren, som ikke tager parametre, derfor tomme parenteser ().
        Rectangle værelse1 = new Rectangle(); //Dette er et objekt.

//dot-operator efter objektets navn fortæller, hvilke operationer, der kan udføres på objektet.
        //Vi angiver værdier til længden og bredden.
        værelse1.setBredde(25);
        værelse1.setLængde(50);
        //vi beregner areal ud fra ovenstående værdier i nyt variabelnavn = værelse1 + dot-operator.
        double arealVærelse1 = værelse1.beregnAreal();

//Kalder parameter-konstruktøren.
        Rectangle værelse2 = new Rectangle(30, 75);
        double arealVærelse2 = værelse2.beregnAreal();

    }
/* Konklusion: Vi har brugt Rectangle-klassen til at modellere vores to værelser.
Dvs. værelsernes arealer er beregnet ud fra en skabelon/blueprint.
Et værelse er blot én type rektangel, man alle typer rektangler beregnes jo ud fra samme
formel/skabelon/blueprint.
 */

}
