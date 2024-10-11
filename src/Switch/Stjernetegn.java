package Switch;

import java.util.Scanner;

public class Stjernetegn {
    public static String stjernetegn(int svar) {


        return switch (svar) {
            case 1 -> "Du er stenbuk!";
            case 2 -> "Du er vandmand!";
            case 3 -> "Du er fisk!";
            case 4 -> "Du er vædder!";
            case 5 -> "Du er tyr!";
            case 6 -> "Du er tvilling!";
            case 7 -> "Du er krebs!";
            case 8 -> "Du er løve!";
            case 9 -> "Du er jomfru!";
            case 10 -> "Du er vægt!";
            case 11 -> "Du er skorpion!";
            case 12 -> "Du er skytte!";

            default -> "Du er ingenting!";
        };
    }

    public static void main(String[] args){
        System.out.println("Hvilken måned har du fødselsdag? Vælg tal fra 1-12");
        Scanner input = new Scanner(System.in);
        int svar = input.nextInt();


        System.out.println(stjernetegn(svar));
    }
}
