package Array.Intro01;

public class ParameterIntString {
    //Write a method that takes two parameters:
//An array of Strings
//An integer n
//The method prints the String on the nth index.
    public static void printStringAtIndex(String[] strings, int n) {
        // Først skal vi tjekke, om 'n' er inden for arrayets grænser
        if (n >= 0 && n < strings.length) {
            // Udskriv strengen på det givne indeks
            System.out.println(strings[n]);
        } else {
            // Hvis 'n' er uden for arrayets grænser, udskriv en fejlmeddelelse
            System.out.println("Indeks er uden for grænserne.");
        }
    }
    public static void main(String[] args) {
        // Eksempel på et array af strenge
        String[] names = {"Jens", "Maria", "Lars", "Peter"};

        // Kald metoden og print den streng på det angivne indeks (f.eks. 2)
        printStringAtIndex(names, 2); // Dette udskriver "Lars"
    }
}

