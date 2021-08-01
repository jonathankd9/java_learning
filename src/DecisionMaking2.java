import java.util.Scanner;

public class DecisionMaking2 {

    // Note the following, your favorite number determines the food you get
    // * 0 - 19 = Pizza
    // * 20 - 39 = Chicken Tacos
    // * 40 - 59 = Steak
    // * 60 - 79 = English Muffin
    // * 80 - 100 = Chop Suey
    public static void main(String args[]) {
        String favoriteFood = "Pizza";
        System.out.println("What is your favorite food number: ");
        Scanner scanner = new Scanner(System.in);
        int favNum = scanner.nextInt();

        if (favNum < 20) {
            System.out.println("You will have " + favoriteFood);
        } else if (favNum > 19 && favNum < 40) {
            favoriteFood = "Chicken Tacos";
            System.out.println("You will have " + favoriteFood);
        } else if (favNum > 39 && favNum < 60) {
            favoriteFood = "Steak";
            System.out.println("You will have " + favoriteFood);
        } else if (favNum > 50 && favNum < 80) {
            favoriteFood = "English Muffin";
            System.out.println("You will have " + favoriteFood);
        } else {
            favoriteFood = "Chop Suey";
            System.out.println("Well, You are lucky to have " + favoriteFood);
        }
    }

}
