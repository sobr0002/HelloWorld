package Array.Class;

import java.util.Arrays;

public class SortElements {
//Sorterer array'et elementer i rækkefølge med Arrays.sort()
    public static void main(String[] args) {

//Sortere efter talrækken
        int[] numbers = {32, 11, 4, 12, 1, 22, 3};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

// Sorterer efter alfabetisk orden
        String[] navne = {"Sofie", "Mads", "Åse"};
        Arrays.sort(navne);
        System.out.println(Arrays.toString(navne));

    }
}
