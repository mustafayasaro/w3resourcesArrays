package day02_arrays;

import java.util.*;

public class Example23 {

    public static void main(String[] args) {
        /*
        Write a Java program to test the equality of two arrays.
         */

        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 8, 11};

        System.out.println(Arrays.equals(array1,array2));
        // false

    }
}
