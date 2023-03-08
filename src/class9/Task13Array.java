package class9;

import java.util.Scanner;

/*
task13:
create a variable of type int and call it size
use scanner to ask the user for the size of array and store that
in above variable.
create an empty array of that size
use scanner again to fill that array
use a loop to print all the elements from above array
 */
public class Task13Array {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter size");
        size = scanner.nextInt();

        int [] arr = new int[size];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Elements");
            arr [i] = scanner1.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}

