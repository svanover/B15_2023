package class9;
/*
Task14
Create an integer array with 10 elements and fill it with random values
between 1 and 20. Use a for loop to iterate over the array and find the
largest value.
 */
public class Task14Array {
 public static void main(String[] args) {
   int [] myArr = {2,3,7,8,11, 12,14,16,19,20};

   int largest = myArr[0];

  for (int i = 0; i < myArr.length; i++) {
   if( myArr[i] > largest){
    largest = myArr[i];
   }
  }
  System.out.println(largest);
 }
 }
