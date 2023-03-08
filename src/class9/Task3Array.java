package class9;
/*Task 3: Print out all even numbers in an array of integers

Create an array of integers with some values
Use a for-each loop to iterate over all elements in the array
Use an if statement to check if the element is even
If the element is even, print it out */

public class Task3Array {

    public static void main(String[] args) {

        int [] values = {20,30,45,65,79,90};

        for (int v=0; v < values.length; v++){
        if(values[v] % 2 ==0){
            System.out.println(values[v]);
           }

        }
    }
}
