package class8;
/*
Task 2: Print out even numbers from 2 to 10 using a while loop

    Initialize a variable num to 2.
    Write a while loop that continues as long as num is less than or equal to 10.
    Inside the loop, use an if statement to check if num is even.
    If num is even, print out its value.
    Increment num by 1.
    Run the program and verify that it prints out the even numbers 2, 4, 6, 8, and 10 on separate lines */

public class ForLoop2 {
    public static void main(String[] args) {

                for (int num = 2; num <= 10; num++) {
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                }
            }
        }
