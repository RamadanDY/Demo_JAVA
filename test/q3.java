package test;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average;

        System.out.println("Enter 5 numbers:");

        // Loop to read 5 numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        // Calculate average (casting sum to double for accurate division)
        average = (double) sum / 5;

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average of 5 numbers is: " + average);

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
