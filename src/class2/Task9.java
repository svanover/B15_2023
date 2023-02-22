package class2;
/* 9)Declare two variables num1 and num2 of type double and initialize them to values of your choice.
Use the Math class to calculate the square root of num1 and store the result in a new variable sqrt.
Use the Math class to calculate the power of num1 to num2 and store the result in a new variable power.
Print the values of sqrt and power.*/

public class Task9 {
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 2.0;

        double sqrt = Math.sqrt(num1);
        double power = Math.pow(num1,num2);

        System.out.println(sqrt);
        System.out.println(power);
    }
}
