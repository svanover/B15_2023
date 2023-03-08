package class3;

public class IfCondition {
    public static void main(String[] args) {

        int age = 16;

        if (age >= 18) {
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("You are to young");
        }

        String food = "pizza";

        if (food.equals("pizza")) {

            System.out.println("I love pizza");
        } else {
            System.out.println("I haven't tried that food");
        }

        char gender = 'M';

        if (gender == 'M') {

            System.out.println("Male");
        } else {
            System.out.println("Female");
        }

        int num1 = 45;
        int num2 = 34;


        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else {
            System.out.println(num2 + " is larger");

        }


        boolean hungry = true;

        if(hungry) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

