package class3;
/*3) Declare a String variable called "color" and assign it a value.
        Use if conditions to print a message based on the value of "color".
        If the value of "color" is "red", print "Your favorite color is red".
        If the value is "blue", print "Your favorite color is blue".
        If the value is "green", print "Your favorite color is green". */

public class Task3 {
    public static void main(String[] args) {
        String color = "orange";

        if(color.equals("red")) {
            System.out.println("Your favorite color is red");
        } else if (color.equals("blue")) {
            System.out.println("Your favorite color is blue");
        } else if (color.equals("green")) {
            System.out.println("Your favorite color is green");
        }
    }
}
