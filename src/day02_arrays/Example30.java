package day02_arrays;

public class Example30 {

    public static void main(String[] args) {

        /*
        Write a Java program to check if an array of integers without 0 and -1
         */

        int[] arr = {50, 77, 12, 54, -11};

        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == -1) && (arr[i] == 0)){
            }else {
                count++;
            }
        }

        if (count==0){
            System.out.println("There is no any elements different from 0 and -1");
        }else {
            System.out.println("There are element different from 0 and -1");
            //There are element different from 0 and -1
        }



    }
}
