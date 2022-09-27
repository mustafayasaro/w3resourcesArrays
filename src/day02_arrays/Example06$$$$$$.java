package day02_arrays;

public class Example06$$$$$$ {

    public static void main(String[] args) {

        /*
         Write a Java program to find the index of "Ziya" element.
         */

        String[] name = {"Ali", "Ahmet", "Veli", "Bahadir", "Ziya", "Kamil", "Numan"};
        String str = "Ziya";

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(str)){
                System.out.println(name[i].indexOf(str));
            }
        }

    }
}
