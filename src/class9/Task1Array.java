package class9;
/* Task1
Declare an integer array and initialize it with values.
Create a for loop that will iterate over each element in the array.
Within the for loop, use the current index to access the current element's value.
Print out a message that displays the index and value of the current element.
After the message has been printed, the for loop will move on to the
next element in the array and repeat the process until all elements have been printed
 */



public class Task1Array {
    public static void main(String[] args) {
         int [] array ={2,4,6,8,10};

         for(int i = 0; i < array.length; i++){

             System.out.println("current index " + (i) + " and the current array " + array[i]);
         }

    }
}

