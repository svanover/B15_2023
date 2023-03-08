package class6;
    /* Declare a double variable temperature and assign it any value between 0 and 100.
            Write an if statement that checks if the temperature is between 32 and 70 degrees (inclusive),
            and print a message to the console indicating that
            the weather is pleasant.
            Write another if statement that checks if the temperature is either below 0 degrees or above 100 degrees,
            and print a message to the console indicating
            that the weather is extreme. */

public class LogicalOperators2 {
    public static void main(String[] args) {
        double temperature = 102;

        if(temperature >= 32 && temperature <=70 ) {
            System.out.println("Weather is pleasant");

        }
            if(temperature <= 0 || temperature >= 100 ){
                System.out.println("the weather is extreme");
        }
    }
}


