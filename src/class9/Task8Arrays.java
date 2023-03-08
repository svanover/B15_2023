package class9;
/* Task8
Create an integer array with 8 elements and fill it with random values
between 1 and 50. Use a for loop to iterate over the array and
print out all the values that are less than 25
 */

public class Task8Arrays {
    public static void main(String[] args) {
        int[] list = {4, 7, 10, 20, 23, 35, 48, 50};

        for (int n = 7; n >= 0; n--) {
            if (list[n] <= 25) {
                System.out.println(list[n]);
            }
        }
    }
}