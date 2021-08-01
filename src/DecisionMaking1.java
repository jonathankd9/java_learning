
// This program gives an output based on the number inputted. 
/*  0 - 4 => Enjoy the good luck a friend brings you
    5 - 10 => Your shoe selection will make you every happy today
    more than 10 => We knew it, you selected more than 10
*/

import java.util.Scanner;

public class DecisionMaking1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter an integer between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else if (num >= 5 && num <= 10) {
            System.out.println("Your shoe selection will make you very happy today");
        } else {
            System.out.println("We knew it, you selected more than 10");
        }
    }
}
