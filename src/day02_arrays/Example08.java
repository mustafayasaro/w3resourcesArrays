package day02_arrays;

import java.util.Arrays;

public class Example08 {

    public static void main(String[] args) {

        /*
         Write a Java program to copy an array by iterating the array.
         */

        int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] arr2 = new int[arr1.length];


        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
        //[25, 14, 56, 15, 36, 56, 77, 18, 29, 49]

    }
}
