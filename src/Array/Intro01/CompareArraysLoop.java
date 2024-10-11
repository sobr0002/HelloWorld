package Array.Intro01;

import java.util.Arrays;

public class CompareArraysLoop {

    //Sammenlign arrays med Arrays.equals

    public static void main(String[] args) {

        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {4,5,6};
        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.equals(array1, array3));
            }
        }