package day02_arrays;

public class Example24 {

    public static void main(String[] args) {

        /*
         Write a Java program to find a missing number in an array.
         */

        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        int missing = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]+1!= numbers[i+1]){
                missing = numbers[i]+1;
            }
        }
        System.out.println(missing); //5


    }
}
