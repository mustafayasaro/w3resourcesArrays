package day02_arrays;

public class Example22SumOfTwoArrays {

    public static void main(String[] args) {

        /*
        Write a Java program to find all pairs of elements in an array
        whose sum is equal to a specified number.
         */

        int[] arr = {14, -15, 9, 16, 25, 45, 12, 8};
        int num =  30;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==30){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                    //14 + 16 = 30
                    //-15 + 45 = 30
                }
            }
        }

    }
}
