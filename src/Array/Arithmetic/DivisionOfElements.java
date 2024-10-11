package Array.Arithmetic;

public class DivisionOfElements {

    public static int divisionArray(int[] array) {

        //If-statement behøves ikke i dette konkrete eks.
        if (array.length == 0) { //Betingelse for at hvis array'et er tomt, kan der ikke divideres med noget.
            throw new IllegalArgumentException("Array'et må ikke være tomt.");
        }

        int division = array[0]; //Jeg starter med at første element divideres.

        for (int i = 1; i < array.length; i++) {
            division /= array[i]; //Dividere med næste element

        }
        return division;
    }

    public static void main(String[] args) {

        int[] numbers = {10000, 100, 2};

        int result = divisionArray(numbers);

        System.out.println(result);

    }

}
