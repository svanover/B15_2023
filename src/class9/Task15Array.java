package class9;
/*
Task15
Create a double array with 6 elements and fill it with random decimal
values between 1.0 and 5.0. Use a for loop to iterate over the array and
find the smallest value
 */
public class Task15Array {
    public static void main(String[] args) {

    double [] myArrays = { -1.0, 0.0, 2.0f, 3.0, 4.0, 5.0};
    double smallest = myArrays [0];

       for(int i = 0; i < myArrays.length; i++) {
        if( myArrays[i] < smallest){
            smallest = myArrays[i];
        }
    }
         System.out.println(smallest);
}
}
