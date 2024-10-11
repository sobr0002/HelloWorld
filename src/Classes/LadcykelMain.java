package Classes;

public class LadcykelMain {

    public static void main(String[] args) {

        Ladcykel theLadcykel = new Ladcykel("gul", 3, 4, 20000); //instansierer ladcykel

        Cyklist cyclist1 = new Cyklist("Lars"); //instansierer cyklist
        Cyklist cyclist2 = new Cyklist("Tut");

        System.out.println(theLadcykel);

        if (theLadcykel.cyclistSits(cyclist1)) {
            System.out.println("Hvem kører ladcyklen? Det gør... " + cyclist1.getName());
        } else {
            System.out.println("Øv bøv, der er allerede en biker");
        }



    }
}
