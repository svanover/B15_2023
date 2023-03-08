package class9;
/*
Task9:
Create an integer array with 10 elements and fill it with random values
between 1 and 100. Use a for loop to iterate over the array and find the
sum of all the even numbers.
 */
public class Task9Arrays {
    public static void main(String[] args) {

        int[] item = {27, 33, 38, 45, 49, 51, 63, 69, 71, 88};

        int sum = 0;

        for (int i = 0; i < item.length; i++) {
            if (item[i] % 2 == 0) {
                sum+=item[i];
            }
         }
        System.out.println(sum);
        }
    }

