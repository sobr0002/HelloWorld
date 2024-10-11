package Classes;

public class DogMain {

    public static void main(String[] args) {

        Dog hund = new Dog("Tut", 40.3, 7, false);

        System.out.println(hund.bark() + hund);

        Dog hund1 = new Dog("Molly", 12.2, 12, true);
        System.out.println("\n" + hund1.bark() + hund1);

        Dog hund2 = new Dog("Viggo", 12.1, 6, true && false);
        System.out.println("\n" + hund2.bark() + hund2);
    }
}
