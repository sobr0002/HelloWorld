package Funktioner.ArithmeticOperatorsInFunctions;

public class Exercise3 {
//Implement a BMI calculator method. Identify the needed parameters and return type.

    public static double bmi(double height, double weight) {
        double bmiSvar = weight / (height * height);
        return bmiSvar;
    }


    public static void main(String[] args) {
        System.out.print(bmi(1.82, 79));
    }
}
