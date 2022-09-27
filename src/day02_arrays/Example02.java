package day02_arrays;

public class Example02 {

    public static void main(String[] args) {
        /*
        Write a Java program to sum values of an array.
         */

        int[] sayilar = {1, 9, 5, 4, 6, 3, 8, 7,2};
        int sum = 0;
        for (int each: sayilar
             ) {
            sum+=each;
        }
        System.out.println(sum); // 45

    }
}
