package class10;
/* Task3:
        1)Create an empty array of integers having size 5
        2) Write a for loop that runs 5 times
        3) Inside the loop ask user for a number, store that number in the array,
        repeat this process 5 times
        3) write a separate loop to print all the elements from the array
        Expected output:
        Please Enter a number
        10
        Please Enter a number
        30
        Please Enter a number
        60
        Please Enter a number
        90
        [10, 30, 60, 90]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] values = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int j = 0; j < values.length; j++) {
            System.out.println("Please enter a number");
            values[j] = scanner.nextInt();
        }
        for (int i = 0; i < values.length; i++) {
        }
        System.out.print(Arrays.toString(values));
    }
}


