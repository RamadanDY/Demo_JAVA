public class javaCU {
    // this is our instance variables
    String name;
    int number;

    // write a method that doesnt return anything
    // this class has also been defined so let declare an obj
    void attack() {
        System.err.println(name + "attack");
    }

    public class Main {
        public static void main(String[] args) {
            javaCU p1 = new javaCU();
            p1.name = "pikachu";
            p1.number = 23;

            System.out.println(p1.name + " " + p1.number);

        }
    }

}
