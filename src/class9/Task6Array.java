package class9;
/*
Task6
Create an integer array with 8 elements and fill it with random
values between 1 and 10. Use a for loop to iterate over the array and
count how many times the value 5 appears.
 */

public class Task6Array {
    public static void main(String[] args) {
         int [] count = { 4,5,7,5,9,6,5,1};
         int x = 5;
         int up = 0;

         for(int c = 0; c < count.length; c++){
             if(count[c] == 5){
               up++;
             }
         }
        System.out.println(up);
    }
}
