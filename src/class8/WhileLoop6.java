package class8;

/*Task6: Print out the table of 2 using a while loop

        Initialize a variable num to 1.
        Write a while loop that continues as long as num is less than or equal to 10.
        Inside the loop, calculate the product of num and 2.
        Print out a message that says num +"x 2 =" product, where num is the current value of the loop variable and
         product is the product calculated in step 3.
        Increment num by 1.
        Run the program and verify that it prints out the table of 2 (with each line showing the multiplication of 2 with a number from 1 to 10).
        Here's an example of what the output might look like:
        1 x 2 = 2
        2 x 2 = 4
        3 x 2 = 6
        4 x 2 = 8
        5 x 2 = 10
        6 x 2 = 12
        7 x 2 = 14
        8 x 2 = 16
        9 x 2 = 18
        10 x 2 = 20 */

public class WhileLoop6 {
    public static void main(String[] args) {
        int num = 1;

        while(num<=10){
                System.out.println(num + " X 2 = " + 2 * num);
            num++;
            }

        }

    }
