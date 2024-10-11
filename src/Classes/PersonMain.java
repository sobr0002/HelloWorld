package Classes;

public class PersonMain {

    public static void main(String[] args) {
        //Sender værdier til constructor.

        Person person = new Person("Sofie", "Broman", "Rytter", 29);

        //Kalder constructor og metode (toString().

        String personInfo = person.toString();

        /* Printer variabel ud, som gemmer værdien, der har været sendt til
        konstruktøren og dernæst gennem metoden.
         */

        System.out.println(personInfo);

    }
}
