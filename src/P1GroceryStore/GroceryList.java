package P1GroceryStore;

/*      Declare a Scanner object 'input' to receive user input.
        Declare an integer variable 'numItems' to store the number of items in the grocery list.
        Declare two arrays, 'itemPrices' and 'itemNames', to store the prices and names of the items respectively.
        Prompt the user to enter the number of items on their grocery list using the 'input' object, and store it in 'numItems'.
        Initialize 'itemPrices' and 'itemNames' arrays with the size of 'numItems'.
        Use a for loop to iterate over each item in the list.
        Within the loop, prompt the user to enter the name of the item and store it in 'itemNames[i]'.
        Then, prompt the user to enter the price of the item and store it in 'itemPrices[i]'.
        Use another for loop to iterate over each item in the list.
        Within the loop, print out the name and price of the item in a formatted string.
        Calculate the total cost by using a for loop to iterate over each item in the list, adding each item's price to 'totalCost'.
        Print out the total cost in a formatted string.
        End the main method.

        Sample output:
        How many items are on your grocery list? 3
        Enter the name of item 1: Milk
        Enter the price of Milk: 2.50
        Enter the name of item 2: Bread
        Enter the price of Bread: 1.99
        Enter the name of item 3: Cheese
        Enter the price of Cheese: 3.25

        Your grocery list:
        Milk - $2.5
        Bread - $1.99
        Cheese - $3.25

        Total cost: $7.74
        */

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int numItems;

        String[] itemName;
        double[] itemPrice;
        int quantity = 1;
        double sum = 0;

        System.out.println("How many items are on your grocery list?");
        numItems = input.nextInt();

        itemPrice = new double[numItems];
        Scanner scanner1 = new Scanner(System.in);

        itemName = new String[numItems];
        Scanner scanner2 = new Scanner(System.in);

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter the name of item " + quantity + ":");
            itemName[i] = scanner1.next();
            System.out.println("Enter the price of " + itemName[i] + ":");
            itemPrice[i] = scanner2.nextDouble();
            quantity++;

        }
        System.out.println();
        System.out.println("Your grocery list:");

        for (int i = 0; i < numItems; i++) {
            System.out.println(itemName[i] + " - " + "$" + itemPrice[i]);
        }
        System.out.println();
        System.out.println("Total cost:");

        for (int i = 0; i < numItems; i++) {
            sum += itemPrice[i];
        }
        System.out.println("$" + sum);
    }
}



