package Classes;

import java.util.Scanner;

public class TerningSnakeEyes {

    public static void main(String[] args) {

        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter for spil");

        while (true) {
            scanner.nextLine();
            terning1.roll();
            terning2.roll();


            System.out.println(terning1.endeligFaceValue() +" "+ terning2.endeligFaceValue());

            if (terning1.endeligFaceValue() ==1 && terning2.endeligFaceValue()==1){
                System.out.println("vinder");
                break;
            } else {
                System.out.println("prøv igen");
            }

        }





        }


    }

