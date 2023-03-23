package class15;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(30);
        values.add(40);
        values.add(50);

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));

        }

        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Apple");
        grocery.add("Orange");
        grocery.add("Mango");
        grocery.add("Kiwi");
        grocery.add("Water Melon");
        grocery.add("Onion");
        grocery.add("Potato");
        grocery.add("Tomato");
        grocery.add("Carrot");


        for (int i = 0; i < grocery.size(); i++) {
            String str= grocery.get(i);
            if(str.contains("a")){
                grocery.set(i,"bread");
            }
            System.out.println(grocery.get(i));
        }
    }
}