package class18;

import java.util.HashMap;

/*
Task3:
    Create a HashMap object called 'bookPrices' that stores a String as key and a Double as value.
    Add the following key-value pairs to the 'bookPrices' HashMap using the put() method: "Java Programming" -> 45.99,
    "Data Structures" -> 32.50, "Algorithms" -> 50.00, "Python Basics" -> 20.00.
    Print the names of all the books in the 'bookPrices' HashMap that have a price greater than 40.00.
    Print the names of all the books in the 'bookPrices' HashMap that contain the letter 'o'.
 */
public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Double> bookPrices = new HashMap<>();

        bookPrices.put("Java Programming", 45.99);
        bookPrices.put("Data Structures", 32.50);
        bookPrices.put("Algorithms", 50.00);
        bookPrices.put("Python Basics", 20.00);

        bookPrices.forEach((item, cost)->{
            if(cost>40.00){
                System.out.println(item);
            }
        });
        System.out.println("*********************");

        bookPrices.forEach((item, cost)->{
            if(item.contains("o")){
                System.out.println(item);
            }
        });
    }
}
