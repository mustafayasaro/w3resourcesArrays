package day02_arrays;

public class Example27 {

    public static void main(String[] args) {
        /*
        Write a Java program to find the even and odd integers in a given array of integers
         */

        int[] arr = {5, 7, 2, 4, 9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.println("Even numbers in array : " + arr[i]);
            }else {
                System.out.println("Odd numbers in array : " + arr[i]);
            }
        }
    }
}
