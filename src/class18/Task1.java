package class18;

import java.util.HashMap;
/*
vTask1:
    Create a HashMap object called 'phoneNumbers' that stores a String as key and a Long as value.
    Add the following key-value pairs to the 'phoneNumbers' HashMap using the put() method:
     "John" -> 1234567890, "Mary" -> 2345678901, "Tom" -> 3456789012.
    Print the phone number associated with "Mary" to the console.
 */
public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Long> phoneNumbers = new HashMap<>();

        phoneNumbers.put("John", 1234567890l);
        phoneNumbers.put("Mary", 2345678901l);
        phoneNumbers.put( "Tom", 3456789012l);

        System.out.println(phoneNumbers.get("Mary"));
    }
}