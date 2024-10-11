package Array.Arithmetic;

public class SumofElements {

/*Skriv en metode der både lægger alle tallene sammen og returnerer alle
værdierne af integers i et array */

    //Metoden der summerer værdierne i et int-array, som vi kan kalde summen fra i main.
    public static int sumArray(int[] array) {
        int sum = 0; //Variabel til at holde summen

        //for loop der itererer over arrayet og lægger værdierne sammen.
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; //Her assignes hvert element til sum.

        }
        return sum; //returnerer summen af værdierne, vi lige har lagt sammen vha. iteration.

    }

    public static void main(String[] args) {
        //Assigner nogle værdier til et array

        int[] numbers = {1, 2, 3, 4, 5};

        //Kalder metoden, som får assignet disse værdier for så at lægge dem sammen.
        int result = sumArray(numbers); //Metoden der kaldes gemmes i en ny variabel.
        System.out.println("Summen af a array er: " + result);


        int[] b = {22, 32, 100};

        int resultB = sumArray(b);

        System.out.println("Summen af b array er: " + resultB);

        int[] c = {1000, 4000, 150};

        int resultC = sumArray(c);
        System.out.println("Summen af c array er: " + resultC);
    }

}
