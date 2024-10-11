package IfOrElse;

public class sumDouble {

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum*2;
        }
        else {
            return sum;

        }
    }
    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
    }
}
