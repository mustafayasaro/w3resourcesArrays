package day02_arrays;

import java.util.Arrays;

public class Example29 {

    public static void main(String[] args) {

        /*
         Write a Java program to compute the average value of an array of integers
         except the largest and smallest values.
         */
        int[] arr = {5, 7, 2, 4, 9};

        Arrays.sort(arr);

        double sum = 0;
        double average = 0;

        for (int i = 1; i < arr.length-1; i++) {
            sum+= arr[i];
        }

        average = sum/ (arr.length-2);
        System.out.println(average);  // 5.333333333333333
    }
}
