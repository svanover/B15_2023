package class6;
/* Task3:
    Declare three integer variables, num1, num2, and num3, and assign them any integer values.
    Write an if statement that checks if any two of the three numbers are equal,
    and print a message to the console indicating which numbers are equal.
    Write another if statement that checks if all three numbers are equal,
    and print a message to the console indicating that all three numbers are equal.
 */
public class LogicalOperators3 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 10;
        int num3 = 42;

        if(num1 == num2){
            System.out.println( num1 + "equals" + num2);
        } else if (num2 == num3) {
            System.out.println( num2 + "equals" + num3);
        }else if(num3 == num1){
            System.out.println( num3 + "equals" + num1);
        }

        if(num1 == num2 && num1 == num3){
            System.out.println("all three numbers are equal");

        }

    }
}
