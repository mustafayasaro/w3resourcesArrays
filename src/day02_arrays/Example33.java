package day02_arrays;

import java.util.ArrayList;
import java.util.List;

public class Example33 {

    public static void main(String[] args) {

        /*
        Write a Java program to remove the duplicate elements of a given array and
         return the new length of the array.
          Sample array: [20, 20, 30, 40, 50, 50, 50]
          After removing the duplicate elements the program should return 4 as the new length of the array.
         */

        int[] arr1 = {20, 20, 30, 40, 50, 50, 50};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
        }
        System.out.println(list); // [20, 30, 40, 50]
        System.out.println(list.size());  // 4
    }
}
