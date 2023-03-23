package class15;
/*
Task3:
    1)Create an ArrayList of Booleans.
    2)Add the following booleans to the ArrayList using the add method:
    true, false, true, false.
    3)Write a loop to count and print the number of true values in the ArrayList.
 */

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Boolean> boo = new ArrayList<>();
        boo.add(true);
        boo.add(true);
        boo.add(true);
        boo.add(false);

        int count=0;
        for (int i = 0; i < boo.size(); i++) {

            if(boo.get(i) == true){
                count++;
               }
            }
             System.out.println(count);
        }


    }

