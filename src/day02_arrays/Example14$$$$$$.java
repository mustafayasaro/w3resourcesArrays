package day02_arrays;

public class Example14$$$$$$ {

    public static void main(String[] args) {

        /*
        Write a Java program to find the common elements between two arrays (string values).
        */

        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Common element btw. array1 and array2 : " + array2[j]);
                    //Common element btw. array1 and array2 : JAVA
                }
            }
        }
    }
}
