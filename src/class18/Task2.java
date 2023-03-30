package class18;
/*
Task2
Create a map to store the grocery and their price
print only those items which contain the letter a
print only those items which are more than 5$
 */
import java.util.TreeMap;
public class Task2 {

        public static void main(String[] args) {



            TreeMap<Double, String> groceryList = new TreeMap<>();
            groceryList.put(2.99, "bread");
            groceryList.put(7.99, "chicken");
            groceryList.put(5.99, "rice");



            groceryList.forEach((price,item) -> {
                if (price > 5.0) {
                    System.out.println(price +" "+ item);
                }
            });

            groceryList.forEach((price,item) -> {
                if (item.contains("a")) {
                    System.out.println(price +" "+ item);
                }
            });
        }

    }

