import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter an integer between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num < 5) {
            System.out.println("Enjoy the good luck a friend brings you");

        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }

    }
}
