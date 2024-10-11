package Classes;

public class CarMain {
    public static void main(String[] args) {

        Car sofiesBimmer = new Car("den bedste Bimmer", 5000);

        System.out.println(sofiesBimmer.functionality("start"));
        System.out.println(sofiesBimmer.functionality("kør"));
        System.out.println(sofiesBimmer.functionality("stop"));
        System.out.println(sofiesBimmer.functionality("SPEEDEREN I BUND"));

        Driver tut = new Driver("Tut", 14);

        System.out.println("\n" + tut.drive("start"));
        System.out.println(tut.drive("kør"));
        System.out.println(tut.drive("stop"));
        System.out.println(tut.drive("bumbummelum"));


    }

}
