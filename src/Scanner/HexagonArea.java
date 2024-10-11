package Scanner;
import java.util.Scanner;
public class HexagonArea {
    /*Write a Java program to compute the area of a hexagon. The user should
    put in the length of one of the sides.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your hexagon:");
        double length = input.nextDouble();
        double area = Math.cbrt((3) * Math.pow(length, 2)) / 2;
        System.out.println("The area of your hexagon is: " + area);




    }
}
