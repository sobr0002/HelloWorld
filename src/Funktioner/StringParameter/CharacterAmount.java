package Funktioner.StringParameter;

public class CharacterAmount {
    /* Write a method that takes a String as parameter and returns the amount of
    characters in the given String.
     */
    public static int characterAmount(String s) {
        return s.length();
    }
    public static void main(String[] args) {
        System.out.println(characterAmount("Hello"));
    }
    }