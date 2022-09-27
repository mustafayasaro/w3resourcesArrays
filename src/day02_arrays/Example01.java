package day02_arrays;

import java.util.Arrays;

public class Example01 {

    public static void main(String[] args) {

        /*
        Write a Java program to sort a numeric array and a string array.
         */
        int[] sayilar = {1, 9, 5, 4, 6, 3, 8, 7, 2};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //[1,2, 3, 4, 5, 6, 7, 8, 9]


        String[] isimler = {"Ali", "Ahmet", "Veli", "Bahadir", "Ziya", "Kamil", "Numan"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); //[Ahmet, Ali, Bahadir, Kamil, Numan, Veli, Ziya]


    }
}
