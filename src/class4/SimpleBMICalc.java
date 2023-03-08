package class4;
/* 3)Simple BMI Calculator:
    Declare two variables weight and height and assign them values of 70 and 1.75 respectively.
    Calculate the BMI by dividing the weight by the square of the height and assign it to a new variable bmi.
    Write an if statement that checks if the bmi variable is less than 18.5.
    If the condition is true, print "Underweight" to the console.
    Write an else if statement that checks if the bmi variable is less than 25.
    If the condition is true, print "Normal weight" to the console.
    Write an else if statement that checks if the bmi variable is less than 30.
    If the condition is true, print "Overweight" to the console.
    Write an else statement that prints "Obese" to the console if the bmi variable is greater than or equal to 30 */

public class SimpleBMICalc {
    public static void main(String[] args) {
        int weight = 70;
        float height = 1.75f;

        double bmi = weight / (height*height);

        if(bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<25){
            System.out.println("Normal weight");
        }else if(bmi<30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
