package forexams;

import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Calculate difference (num1 - num2)
        int difference = num1 - num2;

        // Calculate product
        int product = num1 * num2;

        // Calculate average
        double average = (double) (num1 + num2) / 2;

        // Calculate distance (absolute difference)
        int distance = Math.abs(num1 - num2);

        // Calculate maximum
        int max = Math.max(num1, num2);

        // Calculate minimum
        int min = Math.min(num1, num2);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Close the scanner to release resources
        scanner.close();
    }
}
