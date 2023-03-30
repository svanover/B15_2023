package class18;

import java.util.TreeMap;

/*
Task5:
    Create a TreeMap object called 'employees' that stores an Integer (employee ID) and a String (employee name).
    Add the following key-value pairs to the 'employees' TreeMap:
     1 - "John", 2 - "Jane", 3 - "Bob", 4 - "Sarah", 5 - "Tom".
    Remove all the elements from the 'employees' TreeMap for which the key is less than or equal to 2 and the value contains the letter "a".
 */
public class Task5 {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(1, "John");
        employees.put(2, "Jane");
        employees.put(3, "Bob");
        employees.put(4, "Sarah");
        employees.put(5, "Tom");

        employees.entrySet().removeIf(input->input.getKey()<=2 && input.getValue().contains("a"));
        System.out.println(employees);
    }
}