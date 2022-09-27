package day02_arrays;

public class Example26 {

    public static void main(String[] args) {

        /*
        Write a Java program to move all 0's to the end of an array.
        Maintain the relative order of the other (non-zero) array elements
         */

        int[] arr1 = {0, 0, 1, 0, 3, 0, 5, 0, 6};


        int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        int i = 0;
        System.out.print("\nOriginal array: \n");
        for (int n : array_nums)
            System.out.print(n + "  ");

        for (int j = 0, l = array_nums.length; j < l; ) {
            if (array_nums[j] == 0)
                j++;
            else {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < array_nums.length)
            array_nums[i++] = 0;
        System.out.print("\nAfter moving 0's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n + "  ");
        System.out.print("\n");

        //Arrays.sort(arr1);

        //for (int i = arr1.length-1; i >=0 ; i--) {
        //    System.out.print(arr1[i] + " ");
    }


}

