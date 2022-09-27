package day02_arrays;

public class Example31 {

    public static void main(String[] args) {

        /*
        Write a Java program to check if the sum of all the 10's in the array is exactly 30.
        Return false if the condition does not satisfy, otherwise true.
         */
        int[] arr = {10, 77, 10, 54, -11, 10};

        returnMethod(arr);

    }

    private static boolean returnMethod(int[] arr) {
        boolean result = false;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                sum += arr[i];
            }
        }
        if (sum == 30) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);

        return result;
    }
}
