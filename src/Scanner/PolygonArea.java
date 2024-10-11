package Scanner;
import java.util.Scanner;
/* Write a Java program to compute the area of a polygon/mangekant.

 */
public class PolygonArea {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides of the polygon:");
        int sideNumber = input.nextInt();
        System.out.println("Enter the length of the side of the polygon:");
        int sideLength = input.nextInt();
        double area = (sideNumber / 2) * sideLength;


    }
}
