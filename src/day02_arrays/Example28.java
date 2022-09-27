package day02_arrays;

import java.util.Arrays;

public class Example28 {
    public static void main(String[] args) {

        /*
        Write a Java program to get the difference between the largest and smallest values
        in an array of integers. The length of the array must be 1 and above
         */

        int[] arr = {5, 7, 2, 4, 9};

        Arrays.sort(arr);

        System.out.print("difference between the largest and smallest values is ");
        System.out.println(arr[arr.length-1]-arr[0]);

    }
}
