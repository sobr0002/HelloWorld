package Funktioner.ArithmeticOperatorsInFunctions;
// Write a method that takes three integers as parameter, sums the integers and returns the result.
public class ProductNumbers {

    public static int productNumbers(int a, int b, int c, int d) {
        return a*b*c*d;
    }
    public static void main(String[] args) {
        System.out.print("The product of the numbers is: ");
        System.out.print(productNumbers(3, 3, 3, 3));
    }
}
