package class18;

import java.util.TreeMap;

/*
Task4:
    Create a TreeMap object called 'movieRatings' that stores a String as key and an Integer as value.
    Add the following key-value pairs to the 'movieRatings' TreeMap using the put() method:
     "The Godfather" -> 9, "Star Wars" -> 8, "The Shawshank Redemption" -> 10, "Forrest Gump" -> 7.
    Print the names of all the movies in the 'movieRatings' TreeMap that have a rating greater than 8.
    Print the rating of the movie "The Shawshank Redemption" from the 'movieRatings' TreeMap.
 */
public class Task4 {
    public static void main(String[] args) {
       TreeMap<String,Integer> movieRatings = new TreeMap<>();

       movieRatings.put("The Godfather", 9);
       movieRatings.put("Star Wars", 8);
       movieRatings.put("The Shawshank Redemption",10);
       movieRatings.put("Forrest Gump", 7);

       movieRatings.forEach((title,rating)->{
           if(rating>8){
               System.out.println(title + " " + rating);
           }
       });
        System.out.println(movieRatings.get("The Shawshank Redemption"));
    }
}