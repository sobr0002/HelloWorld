package Variables;
/* Write variables to represent a rectangle
Beregn rektangels areal: højde*bredden og omkreds højde+bredde+højde+bredde.
*/

public class ComputeRectangle {
    public static void main(String [] args) {
        double width =5.5;
        double height =8.5;
        double area =width * height;
        System.out.println(area);
        double perimeter =width + height + width + height;
        System.out.println(perimeter);

    }
}
