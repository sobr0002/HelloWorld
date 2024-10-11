package Classes;


public class LampMain {

    public static void main(String[] args) {
        Lamp spisebordslampe = new Lamp("spisebordslampe", true);
        Lamp skrivebordslampe = new Lamp("skrivebordslampe", true);
        Lamp solopgangslampe = new Lamp("solopgangslampe", true);
        spisebordslampe.toggleLight();
        skrivebordslampe.toggleLight();
        solopgangslampe.toggleLight();

        Lamp.printLampNames();



    }
}
