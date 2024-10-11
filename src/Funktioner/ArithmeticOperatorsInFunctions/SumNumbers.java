package Funktioner.ArithmeticOperatorsInFunctions;
// Write a method that takes three integers as parameter, sums the integers and returns the result.
public class SumNumbers {

    public static int sumNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
}

    public static void main(String[] args) {
        System.out.println(sumNumbers(4, 8, 22));
    }
}
