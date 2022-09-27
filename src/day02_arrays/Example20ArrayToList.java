package day02_arrays;

import java.util.ArrayList;
import java.util.List;

public class Example20ArrayToList {
    public static void main(String[] args) {

        /*
         Write a Java program to convert an array to ArrayList.
         */

        String[]  arr = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        //[Python, JAVA, PHP, Perl, C#, C++]

    }
}
