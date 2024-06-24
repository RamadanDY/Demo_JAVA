package forexams;
// Write a Java program to create a class called Shape with a method called getArea().//

// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    double getArea() {
        System.out.println("enter your area");
        return 0;

    }
}

class Rectangle extends Shape {
    // specifying the len and width
    double length;
    double width;

    // we now create a constructor for the rec class
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getArea() method to calculate area of rectangle
    @Override
    double getArea() {
        return length * width;
    }

}

// the main class to test the funtionality
public class Maint {
    public static void main(String[] args) {
        // creaing an instance of the class chape
        Shape p5 = new Shape();
        p5.getArea();

        // creating an instance of the class rectangle
        Rectangle p6 = new Rectangle(5.0, 3.0);

        // call getArea
        // or we could just log the ans directly
        // p6.getArea()
        // System.out.println(p6.getArea());

        double area = p6.getArea();
        System.out.println(area);

    }

}
