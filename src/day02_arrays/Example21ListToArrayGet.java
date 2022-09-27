package day02_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Example21ListToArrayGet {

    public static void main(String[] args) {

        /*
        Write a Java program to convert an ArrayList to an array.
         */
        ArrayList<String> list = new ArrayList<String>();

        list.add("Python");
        list.add("Java");
        list.add("PHP");
        list.add("C#");
        list.add("C++");
        list.add("Perl");

        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
        //[Python, Java, PHP, C#, C++, Perl]


    }
}
