package class6;
/* Task1:
        Write a program for a movie theater that determines whether a customer qualifies for a discount based on
        their age and whether they are a student or a senior. If the customer is either a student or a senior, and
        their age is less than or equal to 18 or greater than or equal to 60, then they qualify for a discount. */
public class MovieTheater {
    public static void main(String[] args) {
        int customerAge = 66;
        boolean  isStudent = true;


        if(customerAge <= 18 && isStudent || customerAge >= 60){
            System.out.println("You qualify for a discount");
        }

    }
  }