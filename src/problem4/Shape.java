package problem4;

// this class is abstract !

// that will make it the standard class other classes will use

public abstract class Shape implements Scalable {

    protected String name;


    // renamed these as triangle was calling on something different and its easier to change this class

    public abstract double area();
    public abstract double perimeter();
    public abstract void scale(double factor);




    @Override
    public String toString() {
        // added tthis is here to match format
        return "Shape: " + name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}
