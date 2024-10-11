package Funktioner.StringParameter;

public class UppercaseString {
    //Write a method that takes a String as parameter and returns the String in full uppercase.
    public static String uppercaseString(String s) {
        return s.toLowerCase();
    }
    public static void main(String[] args) {
        String stringToLower = uppercaseString("HEJ");
        System.out.println(stringToLower);
    }


    }

