package class17;

import java.util.HashSet;

/*
Task5:
    1)Create a HashSet object called 'names' that stores a String.
    2)Add the following strings to the 'names' HashSet using the add() method: "Alice", "Bob", "Charlie", "David".
    3)Remove the names which contain the letter 'a' or 'A', then print the remaining elements of the HashSet.
 */
public class Task5 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        names.removeIf(name->name.contains("a")  || name.contains("A"));
        System.out.println(names);
    }


}
