package class10;
/*
Task2:
    1)Create an empty array of integers having size 5
    2) Write a for loop that runs 5 times
    3) Inside the loop ask user for a number, store that number in the array
    3) write a separate loop to print all the elements from the array
 */

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int [] count = new int [5];

        Scanner scanner = new Scanner(System.in);

        for(int x = 0; x < count.length; x++){
            System.out.println("Please enter a number");
            count[x] = scanner.nextInt();

        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count);
        }

    }
}










