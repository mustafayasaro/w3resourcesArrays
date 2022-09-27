package day01_ConditionalStatement;

public class Example09 {
    public static void main(String[] args) {

        /*
        Create 2 words : name1 and name2

             if the name1 has even numbers of characters,
             then insert the second word in the middle of the first name
             if the first word has odd numbers
             Then print the “Name2 cannot be inserted in the name1”

             e.g:
             name1= mehmet
             name2= ahmet
             Print ==> mehahmetmet
         */

        String name1 = "Mehmet";
        String name2 = "Ahmet";

        int sayi1 = name1.length();
        int sayi = sayi1/2;

        String result = name1.substring(0,sayi) + name2 + name1.substring(sayi,sayi1);

        if (sayi1 %2 ==0){
            System.out.println(result);
        }else {
            System.out.println("Name2 cannot be inserted in the name1");
        }





    }
}
