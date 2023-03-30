package class17;

import java.util.HashSet;

/*
Task1:
    1)Create a HashSet and store fruit like  "Apple" "Banana" "Kiwi"
    2)print all the elements from the set without a loop
    3)Print all the elements from the set using a loop Hint! Try Enhanced loop.
 */
public class Task1 {
    public static void main(String[] args) {
        HashSet<String> food = new HashSet<>();
        food.add("Apple");
        food.add("Banana");
        food.add("Kiwi");
        System.out.println(food);

        for(String healthyFood : food){
            System.out.println(healthyFood);
        }
    }
}
