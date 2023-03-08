package class9;
/*
Task 2: Find the sum of all elements in an array of integers

        Create an array of integers with some values
        Initialize a variable to hold the sum to 0
        Use a for loop to iterate over all elements in the array
        Add each element to the sum variable
        Print out the total sum of all elements */

public class Task2Array {
    public static void main(String[] args) {
        int [] values = {4,3,7,8,9,10};

        int sum = 0;
        for (int x = 0 ; x< values.length; x++){
          sum += values[x];
        }
        System.out.println(sum);
    }
}
