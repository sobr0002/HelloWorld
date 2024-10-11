package Funktioner.ArithmeticOperatorsInFunctions;

import java.util.Random;

public class Exercise6 {

    /*Lav en metode der ikke returnerer noget uden parameter kaldet throwDice. Dvs. metoden returnerer
    ikke noget og modtager ingen input. Metoden skal generere et tilfældigt tal ml. 1 - 6 og udskrive det på skærmen.
    Hvis værdien er 6 skal du skrive 6, Lucky you 🎲
    */
    public static void rollDie() {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        if (roll == 6) {
            System.out.println(roll + ", Lucky you \uD83C\uDFB2");
        } else {
            System.out.println(roll);
        }

    }

    public static void main(String[] args) {
        rollDie();

    }
}
