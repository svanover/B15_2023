package class11;

public class CatTester {
    public static void main(String[] args) {

    Cat cat= new Cat();

    cat.name = "Felix";
    cat.color = "brown";
    cat.gender = 'F';
    cat.breed = "Siamese";
    cat.hasSpots = true;

    cat.meow();
    cat.eat();
    cat.run();


    }
}
