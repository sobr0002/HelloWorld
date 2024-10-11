package Array.Compare;

public class MultiplyCompare {
//Sammenlign elementet med det nærliggende element, for at se, hvilket der er størst.
//Hvis elementet til venstre er størst, skal værdien til højre for ganges med 2.
    public static void main(String[] args) {

        int [] a = {1,7,5,6,4,14,11};

        for (int i = 0; i < a.length -1; i++) {
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;

                System.out.println(a[i]);

            }
        }
    }
}
