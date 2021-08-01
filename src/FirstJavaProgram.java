import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) throws Exception {
        // Printing out a statement

        System.out.println("############################################################");
        System.out.println("My name is Jonathan and I am learning how to code in Java");

        // Taking input from user
        // import java.util.Scanner; && add Scanner scanner = new Scanner(Sytem.in)

        System.out.println("############################################################");
        System.out.println("############################################################");
        Scanner scanner = new Scanner(System.in);

        // Let's take a number and display it
        System.out.println("Input any number of your choice");
        int num = scanner.nextInt();

        System.out.println("############################################################");
        // Displaying output
        System.out.println("Hey, your number is " + num);

        /*
         * if (num < 5) { System.out.println("Enjoy the good luck a friend brings you");
         * 
         * } else {
         * System.out.println("Your shoe selection will make you very happy today"); }
         */

    }
}
