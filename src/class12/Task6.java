package class12;
/*
Task6:
    A method that takes an integer and returns true if the number is even, false if it is odd:
    Define a method with the name isEven that takes an integer parameter: int number.
    Inside the method, use the modulo operator to check if the number is even
 */
//return type=> boolean
// method name => isEven
// parameters => (int number)
//Body{
// if(int number % 2 == 0){
// return true;
// }else{
//return false;

public class Task6 {

    boolean isEven(int number){
        if(number % 2==0){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        Task6 obj=new Task6();
       System.out.println(obj.isEven(5));

    }
}
