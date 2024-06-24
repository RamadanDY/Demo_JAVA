package forexams;

import java.util.Scanner;

public class EnterNum {
    public static void main(String[] argns) {
        Scanner scanner = new Scanner(System.in);
        // prompt to make user enter the two values
        System.out.println("enter the first number ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (number1 + number2 + number3) / 3;

        // Print the average
        System.out.println("Average of the numbers: " + average);

        // Close the scanner to release resources
        scanner.close();

    }

}
