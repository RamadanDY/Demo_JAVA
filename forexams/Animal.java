package forexams;
// Write a Java program to create a class called Animal with a method named move().

//  Create a subclass called Cheetah that overrides the move() method to run.

public class Animal {
    // the method created
    void move() {
        System.out.println("the animals move is ");

    }
}

// creating a subclass to override the move method
class Cheetah extends Animal {
    // lets overinde the move method to do smt else
    void move() {
        System.out.println("lets now make the cheeta move");
    }

    }

    public static void main(String[] args) {
        // so we now create a new istance of the class which is an object
        Animal p1 = new Animal();
        p1.move();

        // note that we have created a class inside a class ie the cheetah is now a
        // subclass
        // so we have to now create an instance of that class ie an obect

        Cheetah p2 = new Cheetah();
        p2.move();

    }
