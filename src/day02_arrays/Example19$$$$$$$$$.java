package day02_arrays;

import java.util.Arrays;

public class Example19$$$$$$$$$ {

    public static void main(String[] args) {

        /*
         Write a Java program to add two matrices of the same size
         */

        int[] arr1 = {1, 0, 6, 15, 6, 4, 7, 0};
        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80};


        int[] arr3 = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr3));
        //[1, 0, 6, 15, 6, 4, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        for (int i = 0; i < arr2.length; i++) {
            for (int j = arr1.length; j < arr3.length; j++) {
                arr3[j] = arr2[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr3));
        //[1, 0, 6, 15, 6, 4, 7, 0, 10, 20, 30, 40, 50, 60, 70, 80]

        //  int[] arr4 =Arrays.copyOf(arr1,arr1.length+ arr2.length);


    }
}
