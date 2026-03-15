package problem3;

public class Demo {

    public static void main(String[] args){


       Shape[] shapeList = new Shape[4];


       shapeList[0] = new Circle(5);
       shapeList[1] = new Ellipse(8,4);
       shapeList[2] = new Triangle(3,4,5);
       shapeList[3] = new EquilateralTriangle(6);


       for (Shape s : shapeList) {
           System.out.println(s);
       }

    }

}
