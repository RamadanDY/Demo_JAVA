package forexams;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Input first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Input second number: ");
        int number2 = scanner.nextInt();

        // Calculate the product of the two numbers
        int product = number1 * number2;

        // Display the result
        System.out.println(number1 + " x " + number2 + " = " + product);

        // Close the scanner to release resources
        scanner.close();
    }

}
