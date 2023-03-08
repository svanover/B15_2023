package class9;
/* Task 4: Calculate the average of all elements in an array of doubles

Create an array of doubles with some values
Initialize a variable to hold the sum to 0.0
Use a for loop to iterate over all elements in the array
Add each element to the sum variable
Divide the sum by the length of the array to calculate the average
Print out the average */

public class Task4Arrays {
    public static void main(String[] args) {
        double [] temp = {70.9, 88.4, 98.6, 100.0};

        double sum = 0.0;
        for (int r = 0; r < temp.length; r++) {
            sum += temp[r];
        }
           double average = sum / temp.length;
           System.out.println(average);
    }
}
