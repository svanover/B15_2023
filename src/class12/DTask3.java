package class12;
/*
Task3:
    A method that takes two arrays of integers and returns the sum of the elements at the same index in each array:
    1)Define a method with the name sumArrays that takes two integer array parameters: int[] arr1 and int[] arr2.
    2)Inside the method, initialize a variable sum to 0.
    3)Use a loop to iterate through the elements of the arrays and add the value of each pair of elements to sum.
    4)Return the value of sum

    //return type => int
    //method name => sumArrays
    //parameters => int[] arr1 and int[] arr2
    //Body => {

    int sum = 0
    int sum1 = 0
    for(int i = 0; i< arr1.length; i++){
    sum+=arr1[i];
    for(int k = 0; k < arr2.length; k++){
    sum1+=arr2[k];
    }
    return sum+sum1;
    }
 */

public class DTask3 {

    int sumArrays(int [] arr1, int [] arr2){
        int sum = 0;
        int sum1 = 0;
        for(int i=0; i< arr1.length; i++) {
          sum+= arr1[i];
        }
        for (int k=0; k<arr2.length; k++){
            sum1+= arr2[k];
        }

       return sum+sum1;
    }

    public static void main(String[] args) {
        DTask3 obj= new DTask3();
        int [] arr1={1,2,3};
        int [] arr2={3,2,1};
        System.out.println(obj.sumArrays(arr1,arr2));
    }
}
