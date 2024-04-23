public class Main4over {
    public static void main(String[] args) {
        // int result = add(3, 4);
        // System.out.println("result : " + result);
        int abeg = add(1, 2);
        System.out.println(abeg);

    }

    static int add(int a, int b) {
        System.out.println("this is overloaded method number one ");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("this is overloaded method number two ");

        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("this is overloaded method number three ");

        return a + b + c + d;
    }
}
