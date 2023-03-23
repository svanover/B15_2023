package class15;

import java.util.ArrayList;

/*
Task4:
    1)Create an ArrayList of Integers
    2)Add the following integers to the ArrayList using the add method: 10, 20, 30, 40, 50
    3)Write a loop to find and print the maximum value in the ArrayList

    return=>
 */

public class Task4 {
    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        int max =0;
        for (int i = 0; i < num.size(); i++) {
            if( num.get(i) > max){
                max = num.get(i);
            }

        }
        System.out.println(max);
    }

}