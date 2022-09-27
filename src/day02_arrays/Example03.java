package day02_arrays;

import java.util.Arrays;

public class Example03 {

    public static void main(String[] args) {

        /*
        Write a Java program to print the following grid.
            Expected Output :

            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
         */

        String arr = " -";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr);
            }
            System.out.println("");
        }





    }
}
