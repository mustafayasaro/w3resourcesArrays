package day02_arrays;

public class Example10 {
    public static void main(String[] args) {

        /*
        Write a Java program to find the maximum and minimum value of an array.
         */

        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);  // max = 77


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min); // min = 14
    }
}
