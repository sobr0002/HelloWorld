package Array.Methods;
/*Lav en metode, der tager en String som parameter og udskriver
hvor mange ord strengen består af. */

public class WordsLengthString {

    public static void countedWords(String words) {

        int wordCount = 0; //Tæller for antal ord.
        boolean inWord = false; //Tjekker om vi er i et ord = flag.

        /*Gennemgår hver karakter i strengen, og tæller ét ord, når
        karakteren adskilles af et mellemrum */
    for (int i = 0; i < words.length(); i++) {
        char currentChar = words.charAt(i);

        //Tjekker om karakteren er et mellemrum
        if (Character.isWhitespace(currentChar)) {//Character=metode, der arbejder med tegn.
            /*i sWhitespace(): statisk metode fra Character-klassen, der tager et char som parameter og
            returnerer en boolean værdi (true eller false). Hvidt tegn/Whitespace = tegn der ikke kan ses, eks. mellemrum, . */

            //Hvis vi når et mellemrum og tidligere var i et ord, øg tælleren
            if (inWord) {
                wordCount++;
                inWord = false; //Flag = false, da vi er ude af ordet.

            }
        } else {
            inWord = true; //Flag = true, når vi inde i ordet.
            }
        /* Konklusion: den skal altså fortsætte med at iterere strengen, når vi er inden i ordet.
        Den tæller ordet, når der kommer mellemrum. */
        }
        if (inWord) { //Vi sikrer os, at det sidste ord tælles med selvom der ikke er mellemrum til sidst.
            wordCount++;
            System.out.println("Antallet er ord er: " + wordCount);
        }

    }
    public static void main(String[] args) {

        String hilsen = "Hej! Ha' en dejlig dag!";
        countedWords(hilsen);
    }


}
