package Funktioner.ArithmeticOperatorsInFunctions;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    /*Lav en metode der ikke returnerer noget uden parameter kaldet throwDice. Dvs. metoden returnerer
    ikke noget og modtager ingen input. Metoden skal generere et tilfældigt tal ml. 1 - 6 og udskrive det
    på skærmen. Hvis værdien er 6 skal du skrive 6, Lucky you 🎲
    */

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args) {
        System.out.println(randomNumber(1, 7));
        Random random = new Random();
        int randomNumber =random.nextInt();
        if (randomNumber==6) {
            System.out.println(randomNumber + "Lucky you" + "\uD83C\uDFB2");
        }
    }

}
