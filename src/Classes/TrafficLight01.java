package Classes;
/* Write a Java program to create class called "TrafficLight" with attributes for color and duration,
and methods to change the color and check for red or green.
 */
public class TrafficLight01 {

    private String colour;
    private int duration;

    public TrafficLight01() {
        this.colour = "red";
        this.duration = 40;
    }
    public void setColour(String colour) {
        this.colour = colour;
        }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getColour() {
        return this.colour;
    }
    public int getDuration() {
        return this.duration;
    }
    public boolean isRed() {
        return this.colour.equalsIgnoreCase("red");
    }
    public boolean isGreen() {
        return this.colour.equalsIgnoreCase("green");
    }
    public boolean isYellow() {
        return this.colour.equalsIgnoreCase("yellow");
    }

    public String toString() {
        return "The light is " + getColour() + " for " + getDuration() + " seconds";
    }

}
