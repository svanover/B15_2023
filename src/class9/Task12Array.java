package class9;
/*
Task12:
Create an array of size 5
use scanner class to take 5 numbers from user and store them inside above array
print all the elements from above array using a loop
 */

import java.util.Scanner;

public class Task12Array {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
            System.out.println(arr[i]);
        }

    }


}
