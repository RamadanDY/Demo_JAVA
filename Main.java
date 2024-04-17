public class Main {
    public static void main(String[] args) {
        // declare and initialize an object
        javaCU p1 = new javaCU();
        // this creates an object and stores in inside the p1
        p1.name = "pikachu";
        p1.number = 23;
        System.out.println(p1.name + " " + p1.number);

        javaCU p2 = new javaCU();
        p2.name = "yakubu";
        System.out.println(p2.name + " " + p1.number);

        p2.attack();
    }
}
