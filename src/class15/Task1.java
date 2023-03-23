package class15;

import java.util.ArrayList;

/*
Task1:
    1)Create an ArrayList of Integers
    2)Store numbers 10 30 40 50 using add method
    3)write a loop to print all the numbers
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> objnum = new ArrayList<>();
        objnum.add(10);
        objnum.add(30);
        objnum.add(40);
        objnum.add(50);

        System.out.println(objnum);
    }
}
