package problem4;

public class Triangle extends Shape {

    // this wil ahve 3 points

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3){


        name = "Triangle";

        // validating each side here

        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){

            System.out.println("Invalid sides for a triangle");
            System.exit(1);
        }


    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;

    }

    // here is an overide taking it from perimeter


    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;

        return Math.sqrt(s * (s - side1) * (s - side2 ) * (s - side3));


    }

    //scaling is added here!

    @Override
    public void scale(double factor){
        side1 *= factor;
        side2  *= factor;
        side3  *= factor;



    }
}
