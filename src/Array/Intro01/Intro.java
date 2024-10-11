package Array.Intro01;

public class Intro {
    /* Figure out what this method does without running it!
Improve the variable names so they make more sense for you
When you have figured out what the method does, give the method a better name
Also show an example of how to use the method
     */

    static char[] doSomething(char[] abc) {
        char[] bac = new char[abc.length];
        int j = abc.length;
        for (int i = 0; i < abc.length; i++) {
            bac[j - 1] = abc[i];
            j = j - 1;
        }

        return bac;
    }

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c'};

        char[] result = doSomething(input);

        System.out.println(result);
    }

    }


