package Project;

import java.util.Scanner;

/*
    Create a Java program that functions as a simple calculator.
    The program should prompt the user to enter two numbers and an operator (+, -, *, /).
    The program should then perform the operation on the two numbers and display the result to the user.

    Project Requirements:

    The program should use the Scanner class to read user input.
    The program should validate user input to ensure that the numbers entered are valid integers
    and that the operator entered is a valid arithmetic operator.
    The program should use nested if statements to determine the operation to be performed based on the operator entered.
    The program should display an error message if the user inputs an invalid operator or a non-integer value.
    The program should allow the user to perform multiple calculations until they choose to exit the program.

    Example Output:

    Welcome to the Simple Calculator!
    Please enter the first number: 5
    Please enter the second number: 10
    Please enter the operator (+, -, *, /): +
    The result is: 15

    Would you like to perform another calculation? (Y/N): Y

    Please enter the first number: 8
    Please enter the second number: 3
    Please enter the operator (+, -, *, /): %
    Invalid operator entered. Please try again.

    Please enter the operator (+, -, *, /): /
    The result is: 2

    Would you like to perform another calculation? (Y/N): N

    Thank you for using the Simple Calculator!

    */
public class P2SimpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        int number1;
        int number2;

        char operator;
        char proceed;

        System.out.println("Please enter the first number:");
        number1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        number2 = scanner.nextInt();
        System.out.println("Please enter the operator (+, -, *, /):");

        Scanner op = new Scanner(System.in);
        operator = op.next().charAt(0);

        if (operator == '+') {
            System.out.println("The result is: " + (number1 + number2));

        } else if (operator == '-') {
            System.out.println("The result is: " + (number2 - number1));

        } else if (operator == '*') {
            System.out.println("The result is: " + (number1 * number2));

        } else if (operator == '/') {
            System.out.println("The result is: " + (number1 / number2));

        } else {
            System.out.println("Invalid operator entered. Please try again.");
        }

        System.out.println();
        System.out.println();

        System.out.println("Would you like to perform another calculation? (Y/N):");

        System.out.println();

        //Use loop?!
       // Scanner scanner1 = new Scanner(System.in);
        //proceed = scanner1.next().charAt(0);

       // boolean Y = true;
        //boolean N = false;



// do while


/*
        if (Y) {
            System.out.println("Please enter the first number:");
            number1 = scanner.nextInt();
            System.out.println("Please enter the second number:");
            number2 = scanner.nextInt();
            System.out.println("Please enter the operator (+, -, *, /):");'
        } else {

            System.out.println("Thank you for using the Simple Calculator!");

 */
        }
    }

