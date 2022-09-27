package day02_arrays;

import java.util.Arrays;

public class Example17 {
    public static void main(String[] args) {

        /*
        Write a Java program to find the second largest element in an array.
         */

        int[] arr = {1, 0, 6, 15, 6, 4, 7, 0};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int secondMax = arr[arr.length-2];

        System.out.println(secondMax);

    }
}
