package class10;
/*
Task 2: Find the sum of all elements in an array of integers

Create an array of integers with some values using the new syntax that we have just learnt
Initialize a variable to hold the sum to 0
Use a for loop to iterate over all elements in the array
Add each element to the sum variable
Print out the total sum of all elements
 */
public class Array1 {

    public static void main(String[] args) {

        int [] arr = new int [4];

        arr [0] = 6;
        arr [1] = 3;
        arr [2] = 7;
        arr [3] = 15;


        int sum = 0;

        for(int sv = 0; sv < arr.length; sv++){
            sum+=arr[sv];
        }
        System.out.println(sum);
    }
}
