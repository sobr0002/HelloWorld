package Classes;

public class ElverMain {

    public static void main(String[] args) {

        Elver spouse1 = new Elver("Bob");

        Elver spouse2 = new Elver("Tut");

        spouse1.getMarriedTo(spouse2);

        spouse2.divorcedTo();
        spouse1.divorcedTo();


    }
}
