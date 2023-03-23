package Project;
    /*
    Declare variables:
    name (String)
    age (int)
    movieTitles (String array)
    movieDirectors (String array)
    movieRatings (String array)
    Initialize the movieTitles, movieDirectors, and movieRatings arrays with movie information.
    movies "The Lion King", "Toy Story", "Finding Nemo", "Harry Potter", "The Avengers"
    movieDirectors : "Jon Favreau", "John Lasseter", "Andrew Stanton", "Chris Columbus", "Joss Whedon"
    Ratings "G", "G", "G", "PG", "PG-13"
    G means suitable for 0-7 years old
    PG suitable  7-13 years old
    PG-13 suitable 13-18 years old
    R greater than 18

    Display a welcome message and prompt the user to enter their name and age using the Scanner class.
    Loop through the movieTitles array and use if-else statements to determine
    which movies are appropriate for the user's age range based on the movie ratings.
    Display the list of appropriate movies to the user.
    Prompt the user to enter the title of the movie they would like to rent.
    Use a for loop to search for the movie title in the movieTitles array.
    If the movie title is found, display the movie details (title, director, and rating) to the user.
    If the movie title is not found, display a message indicating that the movie is not available for the user's age range.
    Display a thank you message to the user.
    Example Output:
    Welcome to the Movie Rental System!
    Please enter your name: John
    Please enter your age: 12

    Movies available for your age range:
    The Lion King (Jon Favreau)
    Toy Story (John Lasseter)
    Finding Nemo (Andrew Stanton)
    Harry Potter (Chris Columbus)

    Please enter the title of the movie you would like to rent: The Lion King

    Movie details:
    Title: The Lion King
    Director: Jon Favreau
    Rating: G

    Thank you for using the Movie Rental System!
    */

import java.util.Scanner;

public class P3MovieRentalSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Movie Rental System!");

        String name;
        int age;
        String [] movieTitles = {"The Lion King", "Toy Story", "Finding Nemo", "Harry Potter", "The Avengers"};
        String [] movieDirectors = {"Jon Favreau", "John Lasseter", "Andrew Stanton", "Chris Columbus", "Joss Whedon"};
        String [] movieRatings = {"G", "G", "G", "PG", "PG-13"};



        System.out.println("Please enter your name:");
        name = scanner.next();
        System.out.println("Please enter your age:");
        age = scanner.nextInt();

        System.out.println();
        System.out.println("Movies available for your age range:");


    }
}
