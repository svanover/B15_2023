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
        String [] itemName = {"Milk, Bread, Cheese"};
        double [] itemPrice = { 2.50,1.99, 3.25};

        System.out.println("Please enter the number of items on your grocery list");
        numItems = input.nextInt();

        itemName [] = ;
        Scanner scanner1 = new Scanner(System.in);

        itemPrice = new double [numItems];
        Scanner scanner2 = new Scanner(System.in);

       for (int i = 0; i < numItems; i++) {
           System.out.println("Please enter the name of your item");
            itemName[i] = scanner1.nextInt();
        }

        for (int i = 0; i < numItems; i++) {
            System.out.println("Please enter the price of your item");
            itemPrice[i] = scanner2.nextInt();
        }
    }
}