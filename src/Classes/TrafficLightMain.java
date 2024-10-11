package Classes;

public class TrafficLightMain {

    public static void main(String[] args) {

        TrafficLight01 light = new TrafficLight01();


        if (light.isRed()) {
            System.out.println(light + ". STOP!");
        }

        light.setColour("Yellow");
        light.setDuration(10);
        if (light.isYellow()) {
            System.out.println(light + ". STOP!");
        }

        light.setColour("green");
        light.setDuration(30);
        if (light.isGreen()) {
            System.out.println(light + ". GO!");
        }
        }
    }

