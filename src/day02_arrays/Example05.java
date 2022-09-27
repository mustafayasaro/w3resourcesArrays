package day02_arrays;

public class Example05 {

    public static void main(String[] args) {

        /*
         Write a Java program to test if an array contains a specific value.
         */
        int[] numbers = {1, 9, 5, 4, 6, 3, 8, 7, 2};
        int num1 = 77;
        int num2 = 7;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == num1) {
                System.out.println("numbers includes num1");
                break;
            } else {
                System.out.println("numbers doesn't include num1");  // numbers doesn't include num1
                break;
            }

        }



        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == num2) {
                System.out.println("numbers includes num2"); // numbers doesn't include num2
                break;
            } else {
                System.out.println("numbers doesn't include num2");
                break;
            }

        }


    }
}
