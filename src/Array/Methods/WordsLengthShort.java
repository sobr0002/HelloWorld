package Array.Methods;
// Lav en metode, der tager en String som parameter og udskriver hvor mange ord strengen består af.
public class WordsLengthShort {

    public static void wordCounter(String words) {
        // Trim og split strengen baseret på mellemrum

        String[] cleanString = words.trim().split("\\s+");
        // Tæl antallet af ord
        int wordCount = cleanString.length;

        System.out.println("Antal ord er: " + wordCount);
    }

    public static void main(String[] args) {
        String greeting = "Hej med dig din flæskesteg!";
        wordCounter(greeting);
    }
}

