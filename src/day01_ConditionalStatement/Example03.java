package day01_ConditionalStatement;

import java.util.Scanner;

public class Example03 {
    /*
    Take three numbers from the user and print the greatest number.

    Test Data
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    Expected Output :
    The greatest: 87
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();

        System.out.println("Please enter second number");
        int num2 = scan.nextInt();

        System.out.println("Please enter third number");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number you entered is " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("The greatest number you entered is " + num2);
        } else {
            System.out.println("The greatest number you entered is " + num3);
        }


    }

}
