package class12;
/*
Task3:
    A method that takes a single parameter and doubles it:
    1)Define a method with the name doubleNumber that takes an integer parameter: int number.
    Inside the method, multiply the number parameter by 2 and return the result
    using the return keyword.
 */
public class Task3 {

    int doubleNumber(int number){
        return 2*(number);

    }

    public static void main(String[] args) {
        Task3 obj= new Task3();

        int num = obj.doubleNumber(100);
        System.out.println(num);
    }

}
