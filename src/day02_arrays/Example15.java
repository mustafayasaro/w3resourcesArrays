package day02_arrays;

public class Example15 {
    public static void main(String[] args) {
        /*
        Write a Java program to find the common elements between two arrays of integers.
         */

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println("Common element btw. array1 and  array2 : " + array1[i]);
                    //Common element btw. array1 and  array2 : 1
                    //Common element btw. array1 and  array2 : 7
                }
            }
        }


    }
}
