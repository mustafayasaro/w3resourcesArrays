package day01_ConditionalStatement;

import java.util.Scanner;

public class Example05 {
    /*
    . Write a Java program that keeps a number from the user
    and generates an integer between 1 and 7 and displays the name of the weekday.
     Test Data
        Input number: 3
        Expected Output :
        Wednesday
      */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a day number of week");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("day = Monday");
        } else if (day == 2) {
            System.out.println("day = Tuesday");
        } else if (day == 3) {
            System.out.println("day = Wednesday");
        } else if (day == 4) {
            System.out.println("day = Thursday");
        } else if (day == 5) {
            System.out.println("day = Friday");
        } else if (day == 6) {
            System.out.println("day = Saturday");
        } else if (day == 7) {
            System.out.println("day = Sunday");
        }
    }


}
