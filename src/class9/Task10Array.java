package class9;

import java.util.Scanner;

/*
Task10:
Create an integer array with 8 elements and fill it with random
values between 1 and 10. Use a for loop to iterate over the array and
find the index of the first occurrence of the value 5.
 */
public class Task10Array {
    public static void main(String[] args) {
        int [] digits = { 1,2,3,4,5,6,7,8,};

        for (int i = 0; i < digits.length; i++) {
            if(digits[i] == 5){
                System.out.println(digits[i]);
                break;
            }

        }

    }
}
