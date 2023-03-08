package class4;

public class SimpleCalc {

    public static void main(String[] args) {

        int num1 =5;
        int num2 = 10;
        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2);

        } else if (operator == '-') {
            System.out.println(num1 - num2);


        } else if (operator == '*') {
            System.out.println(num1 * num2);


        } else if (operator == '/') {
            System.out.println(num1 / num2);

        } else {
            System.out.println("Invalid Operator");

        }

    }
}

