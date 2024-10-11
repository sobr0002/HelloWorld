package Funktioner;

public class IntroFunktion {
    // Learning functions

    // void betyder at den ikke returnerer en værdi
    // Lav variabel med et tal
    public static void duplicateNumber(int num)
    {
    // Lav tekst
        System.out.println("The duplicated number is "+ num*2);

    }
    // Den datatype der skal returneres, skal defineres for main-function (se nedenfor)
    public static int gangNumbers(int number1, int number2)
    {
        // Lav operation som ganger tallene
        int result = number1*number2;
        System.out.println("We are in gangNumber " + result);
        return result;

    }

    public static void main(String[] args) {
        int number = 7;
        int result = 0;
     // Kalder funktionen
        duplicateNumber(number);
        result =gangNumbers(5,3);
        System.out.println("We are in main " + result);

    }
}
