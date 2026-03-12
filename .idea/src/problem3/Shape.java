package problem3;

// this class is abstract !

// that will make it the standard class other classes will use

public abstract class Shape {

    protected String name;

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        // added tthis is here to match format
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
