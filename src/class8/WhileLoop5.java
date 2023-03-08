package class8;
/* Task 5: Print out a countdown from 10 to 1 using a while loop

    Initialize a variable num to 10.
    Write a while loop that continues as long as num is greater than 0.
    Inside the loop, print out the value of num.
    Decrement num by 1. */

public class WhileLoop5 {
    public static void main(String[] args) {

        int num = 10;
        while (num > 0){
            System.out.println(num);
            num--;
        }
    }
}
