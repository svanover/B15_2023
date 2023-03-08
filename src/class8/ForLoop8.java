package class8;
/* Task 8: Print out the sum of the first 10 integers using a while loop

        Initialize a variable num to 1.
        Initialize a variable sum to 0.

        Write a while loop that continues as long as num is less than or equal to 10.
        Inside the loop, add num to sum.
        Increment num by 1.
        Print out the value of sum.
        Run the program and verify that it prints out the sum of the first 10 integers (which is 55). */

public class ForLoop8 {
    public static void main(String[] args) {

        int sum = 0;
        for(int num = 1;num <=10; num ++){
            sum = num + sum;
            System.out.println(sum);

        }
    }
}

