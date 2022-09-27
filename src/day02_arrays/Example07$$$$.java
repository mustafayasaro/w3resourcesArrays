package day02_arrays;

import java.util.Arrays;

public class Example07$$$$ {
    public static void main(String[] args) {

        /*
         Write a Java program to remove a specific element from an array.
         */


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num1 = 5;

        int[] newNumbers = new int[numbers.length - 1];


        for (int i = 0; i < numbers.length; i++) {
            if (num1 != numbers[i]) {
                for (int j = i; j < newNumbers.length; j++) {
                    newNumbers[j] = numbers[i];
                }
            }
        }
        System.out.println(Arrays.toString(newNumbers)); // [1, 2, 3, 4, 4, 6, 7, 8]

        /*
        Eger bir arrayden eleman cikaracaksak yeni bir array olusturmaliyiz
        Cunku array'in uzunlugu degistirilemez
        Yeni olusturdugumuz arrayin uzunlugunu cikartacagimiz eleman sayisina gore belirleriz
         */

    }
}
