package day02_arrays;

public class Example13$$$$$ {

    public static void main(String[] args) {

        /*
        Write a Java program to find the duplicate values of an array of string values.
         */

        String[] arr = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    System.out.println("duplicate element of str array : " + arr[j]);
                    //duplicate element of str array : bcd
                    //duplicate element of str array : oiu
                }
            }
        }


    }
}
