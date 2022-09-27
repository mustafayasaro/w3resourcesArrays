package day02_arrays;

import java.util.Arrays;

public class Example18$$$$$$$ {

    public static void main(String[] args) {

        /*
        Write a Java program to find the second smallest element in an array.
         */

        int[] arr = {1, 0, 6, 15, 6, 4, 7, 0};

        Arrays.sort(arr);

        int secondSmall = arr[0];
        int index = 0;

        while (secondSmall==arr[index]){
            index++;
        }
        secondSmall = arr[index];
        System.out.println(secondSmall); // 1


    }
}
