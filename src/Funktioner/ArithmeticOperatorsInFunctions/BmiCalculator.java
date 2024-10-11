package Funktioner.ArithmeticOperatorsInFunctions;

public class BmiCalculator {
    //Implement a BMI calculator method. Identify the needed parameters and return type.
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    public static void main(String[] args) {
        System.out.println(calculateBMI(1.69, 61.7));
    }
}
