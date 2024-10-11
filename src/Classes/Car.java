package Classes;

public class Car {
/* There is a car, which has attributes model and price, and the car has functionalities start, stop and move.
Also, there is a driver, having attributes name and age, and the behaviour drive.
Create the classes Car and Driver. The functionality of the methods does not matter. Just print something to
the console
 */
    String model;
    int price;


    public Car(String model, int price) {
        this.model = model;
        this.price = price;

    }
    public String carStart() {
        return "Du tænder " + model;
    }
    public String carMove() {
        return "Kør så fremad";
    }

    public String carStop() {
        return model + " er færdig for i dag..";
    }


    public String functionality(String input) {

        if (input.equalsIgnoreCase("start")) {
            return carStart();
        } else if (input.equalsIgnoreCase("kør")) {
            return carMove();
        } else if (input.equalsIgnoreCase("stop")) {
            return carStop();
        }
        return "surt du er gået i stå, du må lære din goblin";



    }

}
