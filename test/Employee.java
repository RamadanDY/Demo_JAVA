package test;

import java.util.Scanner;
// u need to import scanner fpor u to be able to recieve imports from user 

public class Employee {
    int empno;
    String ename;
    float hr, da, basic, netPay;

    public Employee(int empno, String ename, float hr, float da, float basic) {
        this.empno = empno;
        this.ename = ename;
        this.hr = hr;
        this.da = da;
        this.basic = basic;
    }

    public void Calculate() {
        netPay = basic + hr + da;
        // return basic + hr + da;
    }

    // public float havedata() {
    // return empno * (hr + da);
    // }

    public void enterData() {
        Scanner scanner = new Scanner(System.in);
        // this lets say is a method to accept values from users

        System.out.println("Enter Employee Number:");
        empno = scanner.nextInt();
        // idk what this really means buh it consumes the next line
        scanner.nextLine();

        System.out.println("enter Employee   name ");
        ename = scanner.nextLine();

        System.out.println("Enter basic salary");
        basic = scanner.nextFloat();

        System.out.println("enter your hr");
        hr = scanner.nextFloat();

        System.out.println("enteryour br");
        da = scanner.nextFloat();

        // Calculate net pay
        Calculate();

        // Display net pay
        System.out.println("Net Pay: " + netPay);

        scanner.close();
    }

    public static void main(String[] args) {
        Employee employee = new Employee(0, "", 0, 0, 0);
        employee.enterData();

    }

}
