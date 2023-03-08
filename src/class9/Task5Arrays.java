package class9;
/* Task5
Create a double array with 5 elements and fill it with random decimal
values between 1.0 and 5.0. Use a for loop to iterate over the array and
print out all the values that are greater than 3.0. */

public class Task5Arrays {
    public static void main(String[] args) {
        double [] number = {0.58, 1.47, 2.56, 4.56, 5.39};

        for(int n = 3; n < number.length; n++){
            System.out.println(number[n]);
        }
    }
}
