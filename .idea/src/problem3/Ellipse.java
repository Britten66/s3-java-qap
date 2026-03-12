package problem3;


public class Ellipse extends Shape {

    protected double a;

    protected double b;

    public Ellipse(double a, double b){

        name = "Ellipse";

        // a will be largest
        // b will be smallest

        // this is going to be handled with an if statement

        if(a>=b){
            this.a=a;
            this.b=b;

        }else{
            this.a = b;
            this.b = a;
        }


    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter(){
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

}
