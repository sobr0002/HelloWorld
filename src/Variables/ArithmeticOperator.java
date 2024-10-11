package Variables;
/* I hvilken rækkefølge eksekverer Java operationer?
Her aritmetisk operation.
Svar: den eksekverer koden i den rækkefølge, jeg printer den i.
 */
public class ArithmeticOperator {

    public static void main(String[] args) {

        int opg1 =-5 + 8 * 6;
        int opg2 =(55 + 9) % 9;
        int opg3 =20 + -3 * 5 / 8;
        int opg4 =5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(opg1 + " " + opg2 + " " + opg3 + " " + opg4);


    }
}
