package test;

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

    public static void main(String[] args) {

    }

}
