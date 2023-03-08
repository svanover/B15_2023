package class3;

/*4) Declare a String variable called "drink" and assign it a value.
        Use if conditions to print a message based on the value of "drink".
        If the value of "drink" is "juice", print "Your favorite drink is juice".
        If the value is "milk", print "Your favorite drink is milk".
        If the value is "soda", print "Your favorite drink is soda".
        If the value is none of these options, print "Invalid drink choice". */


public class Task4 {
    public static void main(String[] args) {
        String drink = "soda";

        if(drink.equals("juice")) {
            System.out.println("Your favorite drink is juice");
        } else if (drink.equals("milk")) {
            System.out.println("Your favorite drink is milk");
        } else if (drink.equals("soda")) {
            System.out.println("Your favorite drink is soda");
        }else{
            System.out.println("Invalid drink choice");
    }
  }
}
