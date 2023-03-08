package class6;
/*
Task4:
  Declare three variables, isWeekend, isHoliday, and temperature, and assign them boolean and integer values, respectively.
  Write an if statement that checks whether it's either the weekend OR a holiday AND the temperature is greater than or equal to 80 degrees.
  If the condition is true,print "It's a great day for a picnic" to the console. Otherwise,
   print "It's either not a good day for a picnic or not warm enough" to the console.
 */


public class LogicalOperators4 {

    public static void main(String[] args) {
       boolean isWeekend = true;
       boolean isHoliday = false;
       int temperature = 72;

        if(isWeekend || isHoliday && temperature >=80){
            System.out.println("It's a great day for a picnic");

        }else{
            System.out.println("It's either not a good day for a picnic or not warm enough" );
        }

    }
}
