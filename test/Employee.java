package test;

import java.util.Scanner;
// u need to import scanner fpor u to be able to recieve imports from user 

public class Employee {
    int empno;
    String ename;
    float hr, da, basic;

    public Employee(int empno, String ename, float hr, float da, float basic) {
        this.empno = empno;
        this.ename = ename;
        this.hr = hr;
        this.da = da;
        this.basic = basic;
    }

    public float Calculate() {
        return basic + hr + da;
    }

    public float havedata() {
        return empno * (hr + da);
    }

    public void enterData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Number:");
        empno = scanner.nextInt();
        scanner.close();

    }

    public static void main(String[] args) {

    }

}
