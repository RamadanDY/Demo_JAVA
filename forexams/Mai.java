package forexams;

// Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark.
class Animals {
    void makesound() {
        System.out.println(" lets see what this animal does ");
    }
}

class Cat extends Animals {
    @Override
    void makesound() {
        System.out.println("yes ofcourse his one works");
    }

}

public class Mai {
    public static void main(String[] args) {

        Animals p3 = new Animals();
        p3.makesound();

        Cat p4 = new Cat();
        p4.makesound();

    }
}