package day02_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Examples34 {

    public static void main(String[] args) {

        /*
        Write a Java program to find the length of the longest consecutive elements
        sequence from a given unsorted array of integers.
            Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
            The longest consecutive elements sequence is [1, 2, 3, 4, 5],
            therefore the program will return its length 5.
         */

        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // [1, 2, 3, 4, 5, 49, 70, 200]


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+1 == arr[i+1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);


    }
}
