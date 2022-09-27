package day01_ConditionalStatement;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
       /*
        Write a Java program to get a number from the user
        and print whether it is positive or negative
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        System.out.println("Please enter another number");
        int num2 = scan.nextInt();
        if (num1 < 0) {
            System.out.println(num1 + " is negative ");
        } else {
            System.out.println(num1 + " is positive");
        }
        if (num2 < 0) {
            System.out.println(num2 + " is negative ");
        } else {
            System.out.println(num2 + " is positive");
        }

    }
}
