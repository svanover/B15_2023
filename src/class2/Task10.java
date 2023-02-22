package class2;
/*10)Declare three variables num1, num2, and num3 of type int and initialize them to values of your
choice. Use parentheses to specify the order of operations, and perform the following calculation:
num1 + num2 * num3. Store the result in a new variable result and print its value.*/

public class Task10 {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 500;
        int num3 = 2;

        int result = num1 + (num2 * num3);

        System.out.println(result);
    }
}
