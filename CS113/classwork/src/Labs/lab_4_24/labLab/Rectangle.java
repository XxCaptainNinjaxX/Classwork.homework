//*****************************************
//  Sphere.java
//
//  Represents a sphere.
//*****************************************
public class Rectangle extends Shape {

    private double length;
    private double width;

    //----------------------------------
    //  Constructor: Sets up the sphere.
    //----------------------------------
    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    //-----------------------------------------
    //  Returns the  area of the rectangle.
    //-----------------------------------------
    public double area() {
        return length * width;
    }

    //-----------------------------------
    //  Returns the rectangle as a String.
    //-----------------------------------
    public String toString() {
        return super.toString() + " of area " + area();
    }
}
