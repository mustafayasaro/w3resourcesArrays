package day02_arrays;

import java.util.ArrayList;
import java.util.List;

public class Example25UcArrayOrtakElement {

    public static void main(String[] args) {

        /*
        Write a Java program to find common elements from three sorted
        (in non-decreasing order) arrays.
         */

        int arr1[] = {2, 4, 8};
        int arr2[] = {2, 3, 4, 8, 10, 16};
        int arr3[] = {4, 8, 14, 40};

        List<Integer> common = new ArrayList<>();


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i]==arr2[j] && arr2[j] == arr3[k]){
                        common.add(arr3[k]);
                    }
                }
            }
        }
        System.out.println(common);
        //[4, 8]






    }
}
