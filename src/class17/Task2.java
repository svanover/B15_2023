package class17;

import java.util.TreeSet;

/*
Task2:
    1)Create a Set  called 'words' that stores a String.
    2)Add the following strings to the 'words' TreeSet using the add() method: "apple", "banana", "orange", "peach".
    3)Write a loop to print all the words in alphabetical order.
 */
public class Task2 {
    public static void main(String[] args) {

    TreeSet<String> words = new TreeSet<>();
        words.add("apple");
        words.add("orange");
        words.add("peach");
        words.add("banana");

        for(String fruit : words){
            System.out.println(fruit);

        }
    }
}