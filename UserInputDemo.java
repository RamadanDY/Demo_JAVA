import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int d = a + b + c;
        System.out.println("Total = " + d);
    }
}

// import java.util.Scanner;
// import java.util.*;

// public class sir {
// // import java.util.*;
// class UserInputDemo {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in); // System.in is a standard input stream
// System.out.print("Enter first number- ");
// int a = sc.nextInt();
// System.out.print("Enter second number- ");
// int b = sc.nextInt();
// System.out.print("Enter third number- ");
// int c = sc.nextInt();
// int d = a + b + c;
// System.out.println("Total= " + d);
// }
// }

// }
