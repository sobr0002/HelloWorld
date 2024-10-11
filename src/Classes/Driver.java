package Classes;

public class Driver {

        String name;
        int age;

        public Driver(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String drive(String move) {

            if (move.equalsIgnoreCase("start")) {
                return "brumbrummm, host host, ihhh";
            }
            else if (move.equalsIgnoreCase("kør")) {
                return "kør for dælen da, strisserne kommer " + name;
            }
            else if (move.equalsIgnoreCase("stop")) {
                return "Når du filer en kobling, er du en færdig globlin " + name;
            }
            return "Må jeg se dit kørekort? og oplys mig lige på minuttet " +
                    "dit navn og din alder!" + "\n" +
                "Jeg hedder " + name + " og er " + age + " år..";
        }



}
