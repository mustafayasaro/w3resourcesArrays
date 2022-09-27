package day02_arrays;

public class Example04 {

    public static void main(String[] args) {

        /*
        Write a Java program to calculate the average value of array elements.
         */
        double[] num = {1, 9, 5, 4, 6, 3, 8, 7, 2};
        double sum = 0;


        for (double each : num
        ) {
            sum = sum + each;
        }
        System.out.println("sum = " + sum); //sum = 45.0
        System.out.println("average = " + (sum / num.length)); // average = 5
    }
}
