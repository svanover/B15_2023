package class9;
/* Task7
        Create an integer array with 7 elements and fill it with random values
        between 1 and 10. Use a while loop to iterate over the array and print out
        all the odd numbers. */

public class Task7Arrays {
    public static void main(String[] args) {
        int [] count = { 3,4,5,3,7,8,10};

        for(int c = 0; c < count.length; c++){
            if(count[c] % 2 == 1){
                System.out.println(count[c]);
            }
        }
    }
}

