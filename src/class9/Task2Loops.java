package class9;
/* Please solve these tasks as well before we further dicuss arrays
        Write a loop to print below numbers solve below tasks with while loop and
        for loop

        2) 2 4 6 8 10 12 14

     */

public class Task2Loops {
    public static void main(String[] args) {

        int quantity = 2;

        while (quantity<=14) {
            if(quantity % 2 == 0) {
                System.out.println(quantity);
            }
            quantity++;
        }
        System.out.println(/***************/);

        for (int count = 2; count <= 14;  count++) {
            if(count % 2 == 0){
                System.out.println(count);
            }
        }
    }
}

