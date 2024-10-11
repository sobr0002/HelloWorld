package Classes;

public class TriangleMain {
/* Laver Triangle-instanser i ny 'blueprint'/plan.
Dvs. en main class og Main metode. */
    public static void main(String[] args) {

// For at lave en triangel, skal denne gemmes i en variabel.

   /*For at assigne værdier til triangleA, bruges triangle-
   constructor: new Triangle, således attributterne kan tildeles værdier.
    */
    Triangle triangleA = new Triangle(15, 8, 15, 8, 17);

//Laver triangel mere.

    Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
    }
}
/* For at assigne værdier til attributterne i vores Class, bruges
break-point ved variablen i vores konstruktør = program køres nu i
debug mode.
Tryk: "Step Into" -> tilgår variablerne i konstruktøren.
Tryk: "Step Over" -> assigner værdier til variablerne i konstruktøren,
som sender disse værdier til/instialisere attributterne i vores Triangle-Class.
 */
/* Dette gøres først for triangleA og dernæst TriangleB
-> triangleA og triangleB påvirker altså ikke hinanden.
 */