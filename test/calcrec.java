package test;

import java.util.Scanner;

public class calcrec {
    // the method to calculate the area of the triangle
    public static double calcarea(double base, double height) {
        return 0.5 * base * height;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the are of a triangle:");
        System.out.println("enter your base ");

        scanner.close();
    }

}
