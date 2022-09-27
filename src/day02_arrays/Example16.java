package day02_arrays;

import java.util.ArrayList;
import java.util.List;

public class Example16 {
    public static void main(String[] args) {

        /*
         Write a Java program to remove duplicate elements from an array.
         */

        int[] arr = {1, 0, 6, 15, 6, 4, 7, 0};
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println(list1);


        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    list2.add(arr[i]);
                }
            }
        }
        System.out.println(list2);

        for (int i = 0; i < list1.size()-1; i++) {
            for (int j = i; j < list2.size(); j++) {

            }
        }
        System.out.println(list1);

    }
}
