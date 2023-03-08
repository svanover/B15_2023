package class8;
/* Initialize a variable num to 1.
    Write a while loop that continues as long as num is less than or equal to 25.
    Inside the loop, use an if statement to check if num is a multiple of 5(use modulus operator to check if a number is multiple of 5).
    If num is a multiple of 5, print out its value.
    Increment num by 1.
    Run the program and verify that it prints out the multiples of 5 (5, 10, 15, 20, and 25) on separate lines. */


public class WhileLoop4 {

    public static void main(String[] args) {

        int num = 1;
        while (num <= 25) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}

