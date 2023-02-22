package class2;
/* 6)Declare two variables firstName and lastName of type String and initialize them to your first and
last name. Use string concatenation to create a new variable greeting that says "Hello, [firstName]
[lastName]!". Print the value of greeting.*/

public class Task6 {
    public static void main(String[] args) {
         String firstName = "Sarah";
         String lastName = "Vanover";
         String greeting =  "Hello, " + firstName +" "+ lastName + "!";
         
        System.out.println(greeting);
    }
}
