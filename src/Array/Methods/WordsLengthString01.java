package Array.Methods;

public class WordsLengthString01 {

    public static void countedWords(String words) {

        int wordCounter = 0;
        boolean inWord = false;

        for (int i = 0; i < words.length(); i++) {
            char currentChar = words.charAt(i);

            if (Character.isWhitespace(currentChar)) {

                if (inWord) {
                    wordCounter++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }
         if (inWord) {
            wordCounter++;
        System.out.println(wordCounter);
    }
        }
    public static void main(String[] args) {
        String greeting = "Hello my very best friend!";
        countedWords(greeting);
    }
}
