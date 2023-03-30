package class17;

import java.util.HashSet;

/*
Task3:
    1)Create a HashSet object called 'numbers' that stores an Integer.
    2)Add the following integers to the 'numbers' HashSet using the add() method: 10, 20, 30, 40.
    3)Write a loop to calculate and print the sum of all the integers in the 'numbers' HashSet.
 */
public class Task3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum=0;
        for (Integer num : numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
