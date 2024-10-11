package ArrayList;
import Array.Intro01.ArraysToString;

import java.util.ArrayList;
import java.util.Collections;
public class Intro {
    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>(); //create an ArrayList object
        cars.add("Volvo"); //tilføjer elementer til listen med .add
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Skoda");
        System.out.println(cars); //printer listen vha. objektnavn

        //Hvis der skal tilføjes et element på et bestemt indeks i listen = skriv indeksnummer. Derefter elementets navn
        cars.add(0, "Mazda");
        System.out.println(cars);

        cars.add(2,"Audi");
        System.out.println(cars);

        //For at tilgå et enkelt element i ArrayListen, brug getter-metode + indeksnummer
        System.out.println(cars.get(0));

        //For at ændre et element, brug setter-metode
        cars.set(0, "Mercedes");
        System.out.println(cars.get(0)); //ændre Mazda til Mercedes


        //For at tjekke om ArrayListen indeholder en bestemt værdi med .contains()
        cars.contains("Skoda");
        System.out.println(cars.contains("Skoda")); //Printer "true" ud, da listen indeholder "Skoda"
        System.out.println(cars.contains("Lada")); //Printer "false" ud, da ArrayListen ikke indeholder "Lada"


        //For at fjerne et element, brug .remove() efter objektnavnet og indsæt indeksnummeret
        cars.remove(0); //Mercedes er fjernet
        System.out.println(cars);

        //For at fjerne alle elementerne fra ArrayListen, bruges .clear()
        cars.clear();
        System.out.println(cars);

        //For at tjekke ArrayListens størrelse
        cars.size(); //Tjekker størrelsen
        System.out.println(cars.size()); //Tjekker og viser størrelsen


        //Loop gennem ArrayList med et for-loop og bruge .size() til at angive hvor mange gange, loopet skal køre
        ArrayList<String> navne = new ArrayList<>();
        navne.add("Sofie");
        navne.add("Tut");
        navne.add("Charlie");
        for (int i = 0; i < navne.size(); i++) {
            System.out.println(navne.get(i)); //Bruger .get() og indsætter i (tælleren).
        }


        //Loop gennem ArrayList med et foreach-loop
        ArrayList<String> dyrelyde = new ArrayList<>();
        dyrelyde.add("Mjaww");
        dyrelyde.add("Vov");
        dyrelyde.add("Vrinsk");
        for (String i : dyrelyde) {
            System.out.println(i);

        }

        //Lav ArrayList som indeholder tal
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(10);
        myNumbers.add(5);
        for (int i : myNumbers) { //printer tal ud med foreach-loop
            System.out.println(i);
        }

        //Sortér en ArrayList med Strings med .sort()
        //Importér java.util.Collections;
        ArrayList<String> hesteracer = new ArrayList<>();
        hesteracer.add("Pinto");
        hesteracer.add("Haflinger");
        hesteracer.add("Dansk Varmblod");
        hesteracer.add("Engelsk Fuldblod");
        Collections.sort(hesteracer); //Sorterer hesteracer
        for (String i : hesteracer) { //Gøres med foreach-loop
            System.out.println(i); //printer hesteracer ud i alfabetisk rækkefølge
        }

        //Sorter ArrayList med integers med .sort()
        ArrayList<Integer> age = new ArrayList<>();
        age.add(100);
        age.add(25);
        age.add(8);
        age.add(1);
        Collections.sort(age); //Sorterer aldre med foreach-loop
        for (int i : age) {
            System.out.println(i); //printer aldre ud i talrækkefølge
        }


        }




    }

