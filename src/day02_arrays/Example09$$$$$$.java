package day02_arrays;

import java.util.Arrays;

public class Example09$$$$$$ {

    public static void main(String[] args) {

        /*
         Write a Java program to insert an element (specific position) into an array.
         */

        int[] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int num1 = 88;
        int index = 7;


        int[] arr2 = new int[arr1.length+1];

        for (int i = 0; i < arr1.length; i++) {
            if (i<7){
                arr2[i]= arr1[i];
            }
            else if (i==7){
                arr2[i] = num1;
            }else if (i>7){
                arr2[i]=arr1[i-1];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
